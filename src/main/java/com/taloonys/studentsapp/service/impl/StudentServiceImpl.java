package com.taloonys.studentsapp.service.impl;

import com.taloonys.studentsapp.model.Student;
import com.taloonys.studentsapp.repository.StudentDataAccess;
import com.taloonys.studentsapp.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentDataAccess repository;

    @Override
    public List<Student> getStudents() {
        return repository.getStudents();
    }

    @Override
    public boolean saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findStudentByEmail(String email) {
        return repository.findStudentByEmail(email);
    }

    @Override
    public boolean updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public boolean deleteStudent(String email) {
        return repository.deleteStudent(email);
    }

    @Override
    public Student getTestBody() {
        return repository.getTestBody();
    }
}
