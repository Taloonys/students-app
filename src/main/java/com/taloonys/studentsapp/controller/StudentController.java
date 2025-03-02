package com.taloonys.studentsapp.controller;

import com.taloonys.studentsapp.model.Student;
import com.taloonys.studentsapp.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("all")
    public List<Student> getStudentList() {
        return studentService.getStudents();
    }

    @PostMapping("add_student")
    public boolean saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/find_email/{email}")
    public Student findStudentByEmail(@PathVariable String email) {
        return studentService.findStudentByEmail(email);
    }

    @PutMapping("update_student")
    public boolean updateStudent(Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    public boolean deleteStudent(@PathVariable String email) {
        return studentService.deleteStudent(email);
    }
}