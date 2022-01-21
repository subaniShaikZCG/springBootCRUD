package com.example.springbootlv.Service;

import com.example.springbootlv.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getEmps();

    public  Employee getEmp(int empId);

    public Employee addEmp(Employee empl);
}
