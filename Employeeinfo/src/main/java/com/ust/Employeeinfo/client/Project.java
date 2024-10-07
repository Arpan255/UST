package com.ust.Employeeinfo.client;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "project")
public class Project {
    private long projectId;
    private String projectName;
    private String projectDescription;
    private String projectManager;
    private String projectStatus;
    private String projectStartDate;
    private String projectEndDate;
    private double projectBudget;
    private String teamMembers;
    private String companyName;
    private Long ccode;
}