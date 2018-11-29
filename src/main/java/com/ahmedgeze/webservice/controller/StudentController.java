package com.ahmedgeze.webservice.controller;

import com.ahmedgeze.webservice.manager.StudentManager;
import com.ahmedgeze.webservice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="student")
public class StudentController {
    @Autowired
    private StudentManager studentManager;

    @RequestMapping(value = "findByName", method = {RequestMethod.GET})
    public List<Student> findByName(@RequestParam String name) {
        return studentManager.findByName(name);
    }

}
