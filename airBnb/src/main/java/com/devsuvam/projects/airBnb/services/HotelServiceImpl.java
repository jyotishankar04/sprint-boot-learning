package com.devsuvam.projects.airBnb.services;


import com.devsuvam.projects.airBnb.dto.HotelDto;
import com.devsuvam.projects.airBnb.entity.Hotel;
import com.devsuvam.projects.airBnb.entity.Room;
import com.devsuvam.projects.airBnb.exception.ResourceNotFoundException;
import com.devsuvam.projects.airBnb.repository.HotelRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {
    private final HotelRepository hotelRepository;
    private final ModelMapper modelMapper;
    private final InventoryService inventoryService;
    @Override
    public HotelDto createNewHotel(HotelDto hotelDto) {
        log.info("Creating a new hotel with name : " + hotelDto.getName());
        Hotel hotel = modelMapper.map(hotelDto,Hotel.class);
        hotel.setActive(false);

        hotel = hotelRepository.save(hotel);


        return   modelMapper.map(hotel, HotelDto.class);
    }

    @Override
    public HotelDto getHotelById(Long id) {
        log.info("Get the hotel by hotel id: " + id);
        Hotel hotel = hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel not found with ID: " + id));

        return modelMapper.map(hotel,HotelDto.class);
    }

    @Override
    public HotelDto updateHotelById(Long id, HotelDto hotelDto) {
        log.info("Updating the hotel by id: " + id);
        Hotel hotel = hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel not found with ID: " + id));

        modelMapper.map(hotelDto,hotel);
        hotel.setId(id);
        hotel = hotelRepository.save(hotel);

        return modelMapper.map(hotel,HotelDto.class);
    }

    @Override
    @Transactional
    public void deleteHotelById(Long id) {
        log.info("Deleting the hotel by id: " + id);
        Hotel hotel = hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel not found with id " + id));

        for(Room room : hotel.getRooms()){
            inventoryService.deleteFutureInventories(room);
        }

        hotelRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void activateHotelById(Long id){
        log.info("Activating hotel with id: "  + id);
        Hotel hotel = hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel not found with id " + id));
        hotel.setActive(true);
        for(Room room : hotel.getRooms()){
            log.info(hotel.getName());
            inventoryService.initializeRoomForAYear(room);
        }

        hotelRepository.save(hotel);
    }
}
