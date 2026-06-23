package com.devsuvam.projects.airBnb.services;

import com.devsuvam.projects.airBnb.dto.HotelDto;

public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);
    HotelDto getHotelById(Long id);

    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    void deleteHotelById(Long id);
    void activateHotelById(Long id);
}
