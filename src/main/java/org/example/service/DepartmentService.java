package org.example.service;

import org.example.domain.Department;
import org.example.domain.Employee;
import org.example.repository.DepartmentRepository;

import java.util.List;

public class DepartmentService {
    private final DepartmentRepository departmentRepository;
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> addAll(List<Department> departments){
        return departmentRepository.saveAll(departments);
    }

    public List<Department> getAll() {
        return departmentRepository.findAll();
    }

    public Department getDepartmentByName(String name){
        return departmentRepository.getByName(name);
    }

}
