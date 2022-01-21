package com.example.springbootlv.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Generated
    private int empId;
    private String firstName;
    private String lastName;
    private String fullName;
    private String location;
    private double salary;

}
