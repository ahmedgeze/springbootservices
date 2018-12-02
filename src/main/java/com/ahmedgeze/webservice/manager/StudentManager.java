package com.ahmedgeze.webservice.manager;

import com.ahmedgeze.webservice.model.Student;
import com.ahmedgeze.webservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class  StudentManager {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findByName(String name){
        return studentRepository.findByName(name);
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }


}
