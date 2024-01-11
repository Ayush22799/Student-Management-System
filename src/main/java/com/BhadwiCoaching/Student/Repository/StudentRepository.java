package com.BhadwiCoaching.Student.Repository;

import com.BhadwiCoaching.Student.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Integer> {

}
