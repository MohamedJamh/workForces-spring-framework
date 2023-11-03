package org.example;


import org.example.domain.Employee;
import org.example.repository.EmployeeRepository;
import org.example.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        EmployeeService service = (EmployeeService) context.getBean("employeeService");
        service.addEmployee(
                Employee.builder()
                        .name("test")
                        .build()
        );
    }

}
