package com.devsuvam.projects.airBnb.repository;

import com.devsuvam.projects.airBnb.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {
}
