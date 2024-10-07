package com.ust.Projectinfo.service;

import com.ust.Projectinfo.dto.Projectdto;
import com.ust.Projectinfo.model.Project;
import com.ust.Projectinfo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository pro;


    public Project addproject(Projectdto dto) {
        Project project=new Project();
        project.setProjectId(dto.getProjectId());
        project.setProjectName(dto.getProjectName());
        project.setProjectDescription(dto.getProjectDescription());
        project.setProjectStatus(dto.getProjectStatus());
        project.setProjectStartDate(dto.getProjectStartDate());
        project.setProjectEndDate(dto.getProjectEndDate());
        project.setProjectBudget(dto.getProjectBudget());
        project.setTeamMembers(dto.getTeamMembers());
        project.setCompanyName(dto.getCompanyName());
        project.setCcode(dto.getCcode());
        project.setProjectManager(dto.getProjectManager());
        return pro.save(project);
    }

    public List<Project> getProjectBycode(long ccode) {
        return pro.findByCcode(ccode);
    }
}
