package com.ust.Projectinfo.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Projectdto {
    private long projectId;
    @NotNull(message = "Project name cannot be null")
    private String projectName;
    @NotNull(message = "Project description cannot be null")
    private String projectDescription;
    @NotNull(message = "Project manager cannot be null")
    private String projectManager;
    @Pattern(regexp = "^(InProgres|Completed)$")
    private String projectStatus;
    private String projectStartDate;
    private String projectEndDate;
    @Min(value = 1000, message = "Budget must be greater than 1000")
    private double projectBudget;
    @Min(value = 2,message = "Team members must be 2")
    @Max(value=200,message = "Team members cannot exceed 200")
    private int teamMembers;
    @NotNull(message = "Company name cannot be null")
    private String companyName;
    private long ccode;
}
