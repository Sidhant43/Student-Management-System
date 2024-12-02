package com.sms.student_management_system.controller;

import com.sms.student_management_system.entity.Student;
import com.sms.student_management_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/students")
    public ResponseEntity<List<Student>>getAllStudents(){
        List <Student> students=studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.CREATED);
    }


}
