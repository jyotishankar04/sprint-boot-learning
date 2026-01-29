package com.qwikish.suvam.module1intro.controllers;

import com.qwikish.suvam.module1intro.dto.EmployeeDTO;
import com.qwikish.suvam.module1intro.entities.EmployeeEntity;
import com.qwikish.suvam.module1intro.repository.EmployeesRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

//if we use Simple @Controller but then we need to add @ResponseBody to all over the controller


@RestController
public class EmployeeController {
//    @GetMapping(path = "/getSecretMessage")
//    public String getMySuperSecretMessage(){
//        return "Hello here is the secret";
//    }

    private final EmployeesRepository employeesRepository;

    public EmployeeController(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    @GetMapping("/employees/{employeeId}")
    public EmployeeEntity getEmployeeById(@PathVariable Long employeeId){

        return employeesRepository.findById(employeeId).orElse(null);
    }

    @GetMapping("/employees")
    public List<EmployeeEntity> getAllEmployees(@RequestParam(required = false) Integer age, @RequestParam(required = false) String sortBy){
        return employeesRepository.findAll();
    }

    @PostMapping("/employees")
    public EmployeeEntity createNewEmployee(@RequestBody EmployeeEntity inputEmployee){
        return employeesRepository.save(inputEmployee);
    }


}
