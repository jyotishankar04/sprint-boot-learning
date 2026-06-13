package com.devsuvam.projects.airBnb.repository;

import com.devsuvam.projects.airBnb.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {
}
