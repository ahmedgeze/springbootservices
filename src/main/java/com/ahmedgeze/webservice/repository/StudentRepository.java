package com.ahmedgeze.webservice.repository;

import com.ahmedgeze.webservice.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository  extends CrudRepository<Student,Long> {

    List<Student> findByName(String name);
    Student save(Student student);

}
