package com.qwikish.suvam.module1intro.repository;

import com.qwikish.suvam.module1intro.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<EmployeeEntity,Long> {
}
