package com.devsuvam.projects.airBnb.repository;

import com.devsuvam.projects.airBnb.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
