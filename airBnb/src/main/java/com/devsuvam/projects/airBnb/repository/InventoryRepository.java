package com.devsuvam.projects.airBnb.repository;

import com.devsuvam.projects.airBnb.entity.Inventory;
import com.devsuvam.projects.airBnb.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Long> {
    void deleteByDateAfterAndRoom(LocalDate date, Room room);
}
