package com.taloonys.studentsapp.service.impl;

import com.taloonys.studentsapp.model.Student;
import com.taloonys.studentsapp.repository.StudentRepo;
import com.taloonys.studentsapp.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepo repository;

    @Override
    public List<Student> getStudents() {
        return repository.findAll();
    }

    @Override
    public boolean saveStudent(Student student) {
        repository.save(student);

        return true;
    }

    @Override
    public Student findStudentByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public boolean updateStudent(Student student) {
        repository.save(student);

        return true;
    }

    @Override
    public boolean deleteStudent(String email) {
        repository.deleteStudentByEmail(email);

        return true;
    }
}
