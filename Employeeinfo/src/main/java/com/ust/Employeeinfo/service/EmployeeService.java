package com.ust.Employeeinfo.service;

import com.ust.Employeeinfo.client.Fullresponse;
import com.ust.Employeeinfo.client.Project;
import com.ust.Employeeinfo.feign.Projectclient;
import com.ust.Employeeinfo.model.Employee;
import com.ust.Employeeinfo.repository.Employeerepository;
import jakarta.validation.constraints.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private Employeerepository employeerepository;
    @Autowired
    private Projectclient projectclient;

    public Employee saveEmployee(Employee employee) {
        Employee e=new Employee();
        e.setCcode(employee.getCcode());
        e.setName(employee.getName());
        e.setDesignation(employee.getDesignation());
        e.setEmail(employee.getEmail());
        e.setPhone(employee.getPhone());
        e.setSkills(employee.getSkills());
        e.setCity(employee.getCity());
        e.setState(employee.getState());
        e.setExp(employee.getExp());
        e.setDoj(employee.getDoj());
        return employeerepository.save(e);
    }

    public Fullresponse getEmployeeByCcode(Long ccode) {
        Employee e=employeerepository.findByCcode(ccode).orElse(null);
        List<Project> list=projectclient.getProjectbyccode(ccode);
        Fullresponse f=new Fullresponse();
        f.setCcode(e.getCcode());
        f.setName(e.getName());
        f.setDepartment(e.getDepartment());
        f.setDesignation(e.getDesignation());
        f.setEmail(e.getEmail());
        f.setPhone(e.getPhone());
        f.setSkills(e.getSkills());
        f.setCity(e.getCity());
        f.setState(e.getState());
        f.setExp(e.getExp());
        f.setDoj(e.getDoj());
        f.setProjects(list);
        return f;




    }
}
