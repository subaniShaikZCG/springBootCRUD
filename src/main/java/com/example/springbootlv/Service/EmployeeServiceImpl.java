package com.example.springbootlv.Service;

import com.example.springbootlv.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    List<Employee> list;
     public EmployeeServiceImpl(){
         list = new ArrayList<>();
         list.add(new Employee(1,"subani","shaik","subaniShaik","gnt",55000));
         list.add(new Employee(2,"right","from","rightfrom","ap",70000));

     }


    @Override
    public List<Employee> getEmps() {
        return list;
    }

    @Override
    public Employee getEmp(int empId) {
         Employee emp = null;
         for (Employee empl:list){
             if (empl.getEmpId()==empId){
                 emp=empl;
                 break;
             }
         }
        return emp;
    }

    @Override
    public Employee addEmp(Employee empl) {
         list.add(empl);
        return empl;
    }
}
