package com.attendance.attendance.controller;


import com.attendance.attendance.model.Attendance;
import com.attendance.attendance.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class AttendanceController {

    private final AttendanceService attendanceService;
    @PostMapping
    public Attendance save(@RequestBody Attendance attendance) {
        return attendanceService.save(attendance);
    }
}
