package com.ismail.employee_management.controller;

import com.ismail.employee_management.entity.Employee;
import com.ismail.employee_management.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController
{
    private final EmployeeService service;

    public EmployeeController(EmployeeService service)
    {
        this.service = service;
    }

    @GetMapping
    public List<Employee> getAllEmployees()
    {
        return service.getAllEmployees();
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return service.saveEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Integer id)
    {
        return service.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Integer id, @RequestBody Employee employee)
    {
        return service.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Integer id)
    {
        service.deleteEmployee(id);
        return "Employee Deleted Successfully";
    }
}
