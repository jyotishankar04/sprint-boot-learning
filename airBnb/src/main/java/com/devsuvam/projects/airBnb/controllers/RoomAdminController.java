package com.devsuvam.projects.airBnb.controllers;

import ch.qos.logback.core.util.StringUtil;
import com.devsuvam.projects.airBnb.dto.RoomDto;
import com.devsuvam.projects.airBnb.services.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/hotels/{hotelId}/rooms")
@RequiredArgsConstructor
public class RoomAdminController {
    private final RoomService roomService;

    @PostMapping
    public ResponseEntity<RoomDto> createNewRoom(@PathVariable Long hotelId, @RequestBody RoomDto roomDto){
        RoomDto room = roomService.createNewRoomByHotelId(hotelId,roomDto);
        return new ResponseEntity<>(room, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<RoomDto>> getAllRoomsInHostel(@PathVariable Long hotelId){
        return ResponseEntity.ok(roomService.getAllRoomsByHotelId(hotelId));
    }

    @GetMapping("/{roomId}")
    public ResponseEntity<RoomDto> getRoomById(@PathVariable Long roomId){
        return ResponseEntity.ok(roomService.getRoomById(roomId));
    }


    @DeleteMapping("/{roomId}")
    public ResponseEntity<String> deleteRoomById(@PathVariable Long roomId){
        roomService.deleteRoomById(roomId);
        return  ResponseEntity.ok("Room deleted Successfully");
    }
}

