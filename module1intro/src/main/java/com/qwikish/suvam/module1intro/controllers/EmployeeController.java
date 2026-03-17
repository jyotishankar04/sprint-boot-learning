package com.qwikish.suvam.module1intro.controllers;

import com.qwikish.suvam.module1intro.dto.EmployeeDTO;
import com.qwikish.suvam.module1intro.entities.EmployeeEntity;
import com.qwikish.suvam.module1intro.repository.EmployeesRepository;
import com.qwikish.suvam.module1intro.services.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;

//if we use Simple @Controller, but then we need to add @ResponseBody to all over the controller



@RestController
public class EmployeeController {
//    @GetMapping(path = "/getSecretMessage")
//    public String getMySuperSecretMessage(){
//        return "Hello here is the secret";
//    }

    private  final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }



    @GetMapping("/employees/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeId){
        return employeeService.getEmployeeById(employeeId);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public String handleEmployeeNotFound(NoSuchElementException exception){
        return "Employee not found";
    }

    @GetMapping("/employees")
    public List<EmployeeDTO> getAllEmployees(@RequestParam(required = false) Integer age, @RequestParam(required = false) String sortBy){
        return employeeService.getAllEmployees();
    }

    @PostMapping("/employees")
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee){
        return employeeService.createNewEmployee(inputEmployee);
    }

    @PutMapping(path = "/employees/{employeeId}")
    public EmployeeDTO updateEmployee(@RequestBody EmployeeDTO input,@PathVariable Long employeeId){
            return employeeService.updateEmployeeById(employeeId, input);
    }


}
