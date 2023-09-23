package com.attendance.attendance.service;

import com.attendance.attendance.model.Attendance;
import com.attendance.attendance.repositories.AttendanceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class AttendanceService {

    private final AttendanceRepository attendanceRepository;

    public Attendance save(Attendance attendance) {
        Attendance attendanceSaved = attendanceRepository.findActiveAttendance(attendance.getEmployeeId(), attendance.getCustomerId());
        if (attendanceSaved != null) {
            attendanceSaved.setTimeOut(LocalDateTime.now());
            return attendanceRepository.save(attendanceSaved);
        } else {
            attendance.setTimeIn(LocalDateTime.now());
            return attendanceRepository.save(attendance);
        }
    }
}
