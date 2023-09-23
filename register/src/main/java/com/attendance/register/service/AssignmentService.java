package com.attendance.register.service;

import com.attendance.register.model.Assignment;
import com.attendance.register.model.Employee;
import com.attendance.register.repositories.AssigmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AssignmentService {

    private final AssigmentRepository assigmentRepository;

    public Assignment save(Assignment assignment) {
        return assigmentRepository.save(assignment);
    }

    public List<Assignment> findByEmployeeId(Long employeeId) {
        Employee employee = new Employee();
        employee.setEmployeeId(employeeId);
        return assigmentRepository.findByEmployee(employee);
    }

}
