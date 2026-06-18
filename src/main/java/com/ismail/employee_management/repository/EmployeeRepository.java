package com.ismail.employee_management.repository;
import com.ismail.employee_management.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

}
