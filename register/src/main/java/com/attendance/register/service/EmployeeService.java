package com.attendance.register.service;

import com.attendance.register.model.Assignment;
import com.attendance.register.model.Customer;
import com.attendance.register.model.Employee;
import com.attendance.register.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final AssignmentService assignmentService;

    public Long save(Employee employee, Long customerId) {

        Employee savedEmployee = employeeRepository.save(employee);
        Customer customer = new Customer();
        customer.setId(customerId);

        Assignment assignment = new Assignment();
        assignment.setEmployee(savedEmployee);
        assignment.setCustomer(customer);
        assignment.setStartDate(LocalDateTime.now());
        assignment.setEndDate(null);

        assignmentService.save(assignment);
        return savedEmployee.getEmployeeId();
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
