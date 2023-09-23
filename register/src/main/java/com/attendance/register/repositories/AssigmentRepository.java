package com.attendance.register.repositories;

import com.attendance.register.model.Assignment;
import com.attendance.register.model.Customer;
import com.attendance.register.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AssigmentRepository extends CrudRepository<Assignment,Long> {

    List<Assignment> findAll();

    Optional<Assignment> findById(Long assigmentId);

    List<Assignment> findByEmployee(Employee employee);

    Assignment findByCustomer(Customer customer);
}
