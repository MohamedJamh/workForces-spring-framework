package org.example.repository;

import org.example.domain.Department;
import org.example.service.DepartmentService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department getByName(String name);
}
