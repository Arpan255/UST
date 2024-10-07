package com.ust.Employeeinfo.controller;

import com.ust.Employeeinfo.client.Fullresponse;
import com.ust.Employeeinfo.model.Employee;
import com.ust.Employeeinfo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ustemps")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/withprojects/{ccode}")
    public ResponseEntity<Fullresponse> getEmployeeByCcode(@PathVariable("ccode") Long ccode){
        return ResponseEntity.ok(employeeService.getEmployeeByCcode(ccode));
    }
}
