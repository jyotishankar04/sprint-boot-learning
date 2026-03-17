package com.devsuvam.projects.airBnb.repository;

import com.devsuvam.projects.airBnb.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HotelRepository extends JpaRepository<Hotel,Long> {
}
