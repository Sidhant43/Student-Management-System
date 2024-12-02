package com.sms.student_management_system.service.impl;

import com.sms.student_management_system.entity.Student;
import com.sms.student_management_system.repository.StudentRepo;
import com.sms.student_management_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public List<Student> getAllStudents() {
       List<Student> allStudents= studentRepo.findAll();
        return allStudents;
    }
}
