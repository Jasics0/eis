package com.attendance.attendance.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "attendances")
@Data
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial", name = "attendance_id")
    private Long id;
    private Long customerId;
    private Long employeeId;
    private LocalDateTime timeIn;
    private LocalDateTime timeOut;
    @Column(columnDefinition = "text")
    private String photo;

}

