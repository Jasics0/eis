package com.attendance.register.controller;

import com.attendance.register.controller.data.dto.EmployeeDTO;
import com.attendance.register.controller.data.mapper.EmployeeMapper;
import com.attendance.register.model.Assignment;
import com.attendance.register.model.Employee;
import com.attendance.register.service.AssignmentService;
import com.attendance.register.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;
    private final AssignmentService assignmentService;

    @PostMapping("/employee")
    public Long save(@RequestBody EmployeeDTO employee) {
        return employeeService.save(EmployeeMapper.toEntity(employee),employee.getCustomerId());
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/assignments/{employeeId}")
    public List<Assignment> findByEmployeeId(@PathVariable Long employeeId) {
        return assignmentService.findByEmployeeId(employeeId);
    }
}
