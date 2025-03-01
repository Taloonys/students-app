package com.taloonys.studentsapp.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private LocalDate birthDate;
    private String email;
}
