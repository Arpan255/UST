package com.ust.Employeeinfo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee {
    @Id
    private Long ccode;
    private String name;
    private String department;
    private String designation;
    private String email;
    private double phone;
    private List<String> skills;
    private String city;
    private String state;
    private int exp;
    private String doj;
}
