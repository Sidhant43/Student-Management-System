package com.sms.student_management_system.repository;

import com.sms.student_management_system.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepo extends JpaRepository<Student,Long> {

}
