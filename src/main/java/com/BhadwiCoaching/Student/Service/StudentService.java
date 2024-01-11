package com.BhadwiCoaching.Student.Service;

import com.BhadwiCoaching.Student.Utility.Response;
import com.BhadwiCoaching.Student.Entity.Student;

public interface StudentService {

    Response AddStudent(Student student);
    Response getAllStudent();
    Response getStudentById(int id);
    Response deleteAllStudent();
    Response deleteStudentById(int id);
    Response updateStudentByID(int id, Student student);

}
