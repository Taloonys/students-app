package com.taloonys.studentsapp.repository;

import com.taloonys.studentsapp.model.Student;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class StudentDataAccess {
    private final List<Student> STUDENTS_BUFFER = new ArrayList<>();

    public List<Student> getStudents() {
        return STUDENTS_BUFFER;
    }

    public boolean saveStudent(Student student) {
        return STUDENTS_BUFFER.add(student);
    }

    public Student findStudentByEmail(String email) {
        return STUDENTS_BUFFER.stream()
                .filter(student -> student.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    public boolean updateStudent(Student student) {
        var studentIndex = IntStream.range(0, STUDENTS_BUFFER.size())
                .filter(i -> STUDENTS_BUFFER.get(i).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);

        if (studentIndex == -1) {
            return false;
        }

        STUDENTS_BUFFER.set(studentIndex, student);
        return true;
    }

    public boolean deleteStudent(String email) {
        var student = findStudentByEmail(email);
        if (student == null) {
            return false;
        }

        STUDENTS_BUFFER.remove(student);
        return true;
    }

    public Student getTestBody() {
        var currentDate = LocalDate.now();

        return Student.builder()
                        .firstName("Name")
                        .lastName("LastName")
                        .age(23)
                        .birthDate(currentDate)
                        .email("idk@test.com")
                        .build();
    }
}
