package com.devsuvam.projects.airBnb.services;

import com.devsuvam.projects.airBnb.dto.RoomDto;
import com.devsuvam.projects.airBnb.entity.Hotel;
import com.devsuvam.projects.airBnb.entity.Room;
import com.devsuvam.projects.airBnb.exception.ResourceNotFoundException;
import com.devsuvam.projects.airBnb.repository.HotelRepository;
import com.devsuvam.projects.airBnb.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class RoomServiceImpl implements RoomService{
    private  final RoomRepository roomRepository;
    private final HotelRepository hotelRepository;
    private final InventoryService inventoryService;
    private final ModelMapper modelMapper;

    @Override
    public RoomDto createNewRoomByHotelId(Long hotelId,RoomDto roomDto) {
        log.info("Creating a new room in hotel with hotel id: " + hotelId);
        Hotel hotel = hotelRepository.findById(hotelId)
                .orElseThrow(()->  new ResourceNotFoundException("Hotel not found with hotel ID : " + hotelId));

        Room room = modelMapper.map(roomDto,Room.class);
        room.setHotel(hotel);
        roomRepository.save(room);
//      TODO: Create Inventory as soon as room is created and if hotel is active
        if(hotel.getActive()){
            inventoryService.initializeRoomForAYear(room);
        }
        return modelMapper.map(room, RoomDto.class);
    }

    @Override
    public List<RoomDto> getAllRoomsByHotelId(Long hotelId) {
        log.info("Getting all  rooms in hotel with hotel id: " + hotelId);
        Hotel hotel = hotelRepository.findById(hotelId).orElseThrow(()-> new ResourceNotFoundException("Hotel not found with id : " + hotelId));

        return hotel.getRooms().stream().map(element -> modelMapper.map(element, RoomDto.class)).collect(Collectors.toList());
    }

    @Override
    public RoomDto getRoomById(Long id) {
        log.info("Getting room with room id: " + id);

        Room room = roomRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Room not found with id : " + id));
        return modelMapper.map(room, RoomDto.class);
    }

    @Override
    public void deleteRoomById(Long id) {
        log.info("Deleting room with room id: " + id);
        Room room = roomRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Room not found with id : " + id));
        inventoryService.deleteFutureInventories(room);
        roomRepository.deleteById(id);
    }
}
