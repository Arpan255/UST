package com.ust.Projectinfo.controller;

import com.ust.Projectinfo.dto.Projectdto;
import com.ust.Projectinfo.model.Project;
import com.ust.Projectinfo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class controller {
    @Autowired
    private ProjectService projectService;

    @PostMapping("/addproject")
    public ResponseEntity<Project> addproject(@RequestBody Projectdto dto)
    {
        return new ResponseEntity<>(projectService.addproject(dto), HttpStatus.CREATED);
    }

    @GetMapping("/showproject/{ccode}")
    public ResponseEntity<List<Project>> getproject(@PathVariable("ccode") long ccode)
    {
        return ResponseEntity.ok(projectService.getProjectBycode(ccode));
    }
}
