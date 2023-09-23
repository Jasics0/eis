package com.attendance.register.controller.data.mapper;

import com.attendance.register.controller.data.dto.EmployeeDTO;
import com.attendance.register.model.Employee;

public class EmployeeMapper {

    public static Employee toEntity(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setId(employeeDTO.getId());
        employee.setName(employeeDTO.getName());
        return employee;
    }

}
