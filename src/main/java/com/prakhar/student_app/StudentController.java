package com.prakhar.student_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;

    @RequestMapping("/getStudents")
    public List<Student> getStudent(){
        return repo.findAll();
    }

    @RequestMapping("/add")
    public void addStudent(){
        Student s = new Student();
        s.setId(22);
        s.setName("Raj");
        s.setAge(30);

        repo.save(s);
    }


}
