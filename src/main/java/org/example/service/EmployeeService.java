package org.example.service;

import org.example.domain.Employee;
import org.example.repository.EmployeeRepository;

import java.util.List;

public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }
    public List<Employee> addAll(List<Employee> employees){
        return employeeRepository.saveAll(employees);
    }
}
