package com.devsuvam.projects.airBnb.services;


import com.devsuvam.projects.airBnb.entity.Room;

import java.time.LocalDate;

public interface InventoryService {
    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);
}