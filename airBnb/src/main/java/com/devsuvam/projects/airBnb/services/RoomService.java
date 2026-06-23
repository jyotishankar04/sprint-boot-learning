package com.devsuvam.projects.airBnb.services;

import com.devsuvam.projects.airBnb.dto.RoomDto;

import java.util.List;

public interface RoomService {
    RoomDto createNewRoomByHotelId(Long hotelId,RoomDto roomDto);
    List<RoomDto> getAllRoomsByHotelId(Long hotelId);
    RoomDto getRoomById(Long id);
    void deleteRoomById(Long id);
}
