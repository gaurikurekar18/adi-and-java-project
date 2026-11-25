package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student1")
public class Student1 {

    @Id
    private int id;

    private String name;

    @Column(name = "email", unique = true)
    private String email;

    private double marks;

    private double fees;

    private String address;

    public Student1() {
    }
}
