package com.attendance.register.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "employees")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial", name = "employee_id")
    private Long employeeId;

    private String id;

    private String name;

    private String photo;


}
