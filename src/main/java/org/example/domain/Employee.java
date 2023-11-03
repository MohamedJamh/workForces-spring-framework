package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import lombok.NoArgsConstructor;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double salary;
    @ManyToOne
    private Department department;

    public Employee( String name, double salary, Department department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}
