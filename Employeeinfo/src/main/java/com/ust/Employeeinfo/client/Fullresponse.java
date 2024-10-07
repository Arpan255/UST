package com.ust.Employeeinfo.client;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fullresponse {
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
    public List<Project> projects;
}