package com.rocode.employeeManagementService.controller;

import com.rocode.employeeManagementService.entity.Employee;
import com.rocode.employeeManagementService.service.EmployeeServiceI;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/emp")
public class EmployeeController {
    private final EmployeeServiceI service;

    @PostMapping
    public Employee createEmp(@RequestBody Employee employee){
        return service.createEmp(employee);
    }

    @GetMapping
    public List<Employee> getAllEmp(){
        return service.getAllEmp();
    }

    @GetMapping("/{id}")
    public Employee getEmpById(@PathVariable Long id){
        return service.getEmpById(id);
    }

    @PutMapping("/{id}")
    public Employee updateEmp(@PathVariable Long id, @RequestBody Employee updatedEmp){
        return service.updateEmpById(id,updatedEmp);
    }

    @DeleteMapping("/{id}")
    public String deleteEmp(@PathVariable Long id){
        service.deleteEmp(id);
        return "Emp deleted success";
    }
}
