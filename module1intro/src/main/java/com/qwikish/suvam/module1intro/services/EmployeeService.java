package com.qwikish.suvam.module1intro.services;

import com.qwikish.suvam.module1intro.dto.EmployeeDTO;
import com.qwikish.suvam.module1intro.entities.EmployeeEntity;
import com.qwikish.suvam.module1intro.repository.EmployeesRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeesRepository employeesRepository;

    private final ModelMapper modelMapper;

    public EmployeeService(EmployeesRepository employeesRepository, ModelMapper modelMapper) {
        this.employeesRepository = employeesRepository;
        this.modelMapper = modelMapper;
    }


    public EmployeeDTO getEmployeeById(Long id) {
        EmployeeEntity employeeEntity = employeesRepository.findById(id).orElse(null);
        return modelMapper.map(employeeEntity,EmployeeDTO.class);
    }

    public List<EmployeeDTO> getAllEmployees() {
        List<EmployeeEntity> employeeEntityList =  employeesRepository.findAll();
        return employeeEntityList.stream().map(employeeEntity -> modelMapper.map(employeeEntity,EmployeeDTO.class)).toList();
    }

    public EmployeeDTO createNewEmployee(EmployeeDTO inputEmployee) {
        EmployeeEntity employee = modelMapper.map(inputEmployee,EmployeeEntity.class);
        EmployeeEntity employeeEntity =   employeesRepository.save(employee);
        return modelMapper.map(employeeEntity,EmployeeDTO.class);
    }


    public EmployeeDTO updateEmployeeById(Long employeeId, EmployeeDTO input) {
        EmployeeEntity employee = modelMapper.map(input,EmployeeEntity.class);
        employee.setId(employeeId);
        EmployeeEntity saveEmployeeEntity = employeesRepository.save(employee);

        return modelMapper.map(saveEmployeeEntity,EmployeeDTO.class);
    }
}
