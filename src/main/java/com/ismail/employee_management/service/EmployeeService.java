package com.ismail.employee_management.service;
import com.ismail.employee_management.entity.Employee;
import com.ismail.employee_management.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService
{
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository)
    {
        this.repository = repository;
    }

    public List<Employee> getAllEmployees()
    {
        return repository.findAll();
    }

    public Employee saveEmployee(Employee employee)
    {
        return repository.save(employee);
    }

    public Employee getEmployeeById(Integer id)
    {
        return repository.findById(id).orElse(null);
    }

    public Employee updateEmployee(Integer id, Employee updatedEmployee)
    {
        Employee employee = repository.findById(id).orElse(null);

        if(employee != null)
        {
            employee.setName(updatedEmployee.getName());
            employee.setSalary(updatedEmployee.getSalary());
            return repository.save(employee);
        }
        return null;

    }

    public void deleteEmployee(Integer id)
    {
        repository.deleteById(id);
    }
}
