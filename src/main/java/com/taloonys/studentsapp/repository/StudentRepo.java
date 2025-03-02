package com.taloonys.studentsapp.repository;

import com.taloonys.studentsapp.model.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

    @Transactional
    void deleteStudentByEmail(String email);

    Student findByEmail(String email);
}
