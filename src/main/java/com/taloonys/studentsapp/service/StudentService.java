package com.taloonys.studentsapp.service;

import com.taloonys.studentsapp.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    List<Student> getStudents();

    boolean saveStudent(Student student);

    Student findStudentByEmail(String email);

    boolean updateStudent(Student student);

    boolean deleteStudent(String email);

    Student getTestBody();
}