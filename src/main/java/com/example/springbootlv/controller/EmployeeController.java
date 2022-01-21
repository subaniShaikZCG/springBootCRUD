package com.example.springbootlv.controller;

import com.example.springbootlv.Service.EmployeeService;
import com.example.springbootlv.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value="/saveEmployee", method = RequestMethod.POST)
    public String saveEmployee(@RequestBody Employee employee){
        System.out.println(employee.getLocation());
        return "successfully saved employee data";
    }

//    @RequestMapping(value="/getEmployees", method = RequestMethod.GET)
//    public ResponseEntity<List<Employee>> getAllEmployees(){
//        List<Employee> listEmp = getAllEmployees().getBody();
//        return new ResponseEntity<List<Employee>>(listEmp, HttpStatus.FOUND);
//    }

    @RequestMapping(value="/getEmployees", method = RequestMethod.GET)
    public String getEmployeeData(){
        return "all of the employees list below here";
    }

    // get the employees
    @RequestMapping(value="/getEmpls", method = RequestMethod.GET)
    public List<Employee> getEmps(){


        return this.employeeService.getEmps();
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable int empId){
        return  this.employeeService.getEmp(empId);
    }

    @PostMapping("/addEmployee")
    public Employee addEmpl(@RequestBody Employee empl){
    return  this.employeeService.addEmp(empl);
    }
}
