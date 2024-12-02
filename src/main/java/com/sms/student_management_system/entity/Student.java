package com.sms.student_management_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "Email_id",nullable = false)
    private String email;
    @Column(name = "gender",nullable = false)
    private String gender;
}
