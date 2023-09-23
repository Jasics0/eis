package com.attendance.attendance.repositories;

import com.attendance.attendance.model.Attendance;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends CrudRepository<Attendance, Long> {
    @Query("SELECT a FROM Attendance a WHERE a.employeeId = ?1 AND a.customerId= ?2 AND a.timeOut IS NULL")
    Attendance findActiveAttendance(Long employeeId, Long customerId);
}
