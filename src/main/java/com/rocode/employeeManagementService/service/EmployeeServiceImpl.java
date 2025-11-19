package com.rocode.employeeManagementService.service;

import com.rocode.employeeManagementService.entity.Employee;
import com.rocode.employeeManagementService.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeServiceI{

    private final EmployeeRepository repository;
    @Override
    public Employee createEmp(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public List<Employee> getAllEmp() {
        return repository.findAll();
    }

    @Override
    public Employee getEmpById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Employee updateEmpById(Long id, Employee employee) {
        Employee employee1 = getEmpById(id);
        employee1.setName(employee.getName());
        employee1.setEmail(employee.getEmail());
        employee1.setDepartment(employee.getDepartment());
        return repository.save(employee1);
    }

    @Override
    public void deleteEmp(Long id) {
        repository.deleteById(id);
    }
}
