package com.rocode.employeeManagementService.service;

import com.rocode.employeeManagementService.entity.Employee;

import java.util.List;

public interface EmployeeServiceI {
    Employee createEmp(Employee employee);
    List<Employee> getAllEmp();
    Employee getEmpById(Long id);
    Employee updateEmpById(Long id,Employee employee);
    void deleteEmp(Long id);
}
