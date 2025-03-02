package com.taloonys.studentsapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.Period;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    @Transient
    private int age;

    private LocalDate birthDate;

    @Column(unique = true)
    private String email;

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
