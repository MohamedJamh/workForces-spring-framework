package org.example;


import org.example.domain.Department;
import org.example.domain.Employee;
import org.example.repository.EmployeeRepository;
import org.example.service.DepartmentService;
import org.example.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App
{
    private static EmployeeService employeeService;
    private static DepartmentService departmentService;
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        employeeService = (EmployeeService) context.getBean("employeeService");
        departmentService = (DepartmentService) context.getBean("departmentService");

        addDepartments();
        Department devopsDepartment = departmentService.getDepartmentByName("Devops");
        Employee employee = employeeService.addEmployee(
                new Employee("name",1000, devopsDepartment)
        );
        System.out.println(employeeService.getAll().get(0));
    }

    public static void addDepartments(){
        if(departmentService.getAll().isEmpty()){
            List<Department> departments = new ArrayList<>();
            departments.add(
                    Department.builder()
                            .name("Devops").build()
            );
            departments.add(
                    Department.builder()
                            .name("Human resources").build()
            );
            departments.add(
                    Department.builder()
                            .name("Pen Testers").build()
            );
            departmentService.addAll(departments);
        }
    }

}
