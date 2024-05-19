package com.tungol.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tungol.student.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
