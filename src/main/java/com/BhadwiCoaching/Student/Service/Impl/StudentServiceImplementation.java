package com.BhadwiCoaching.Student.Service.Impl;

import com.BhadwiCoaching.Student.Exception.DetailsNotFoundException;
import com.BhadwiCoaching.Student.Utility.ErrorResponse;
import com.BhadwiCoaching.Student.Utility.Response;
import com.BhadwiCoaching.Student.Utility.SucessResponse;
import com.BhadwiCoaching.Student.Entity.Student;
import com.BhadwiCoaching.Student.Repository.StudentRepository;
import com.BhadwiCoaching.Student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImplementation implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Response AddStudent(Student student) {
        Student response = studentRepository.save(student);
       return new SucessResponse("Details saved Successfully", response);
    }
    @Override
    public Response getAllStudent() {

        List<Student> studentsList = studentRepository.findAll();
        if (studentsList.isEmpty()){
        throw new DetailsNotFoundException("No Details exists!!");
        }
        return new SucessResponse("Details retrieved successfully", studentsList);
}

    @Override
    public Response getStudentById(int id) {
        Optional<Student> student = studentRepository.findById(id);
         if(student.isEmpty()){
            throw new DetailsNotFoundException("No Details exists!!");
        }
        else {
            return new SucessResponse("Details retrieved successfully", student.get());
        }
        }

    @Override
    public Response deleteAllStudent() {
        studentRepository.deleteAll();
        return new SucessResponse("Deleted All Successfully");
    }

    @Override
    public Response deleteStudentById(int id) {
        Optional<Student> student = studentRepository.findById(id);
        if(student.isEmpty()){
            throw  new DetailsNotFoundException("No Details exists!!");
        }
        else {
            studentRepository.deleteById(id);
            String name = student.get().getName();
            return new SucessResponse(name + "'s record deleted successfully");
        }}

    @Override
    public Response updateStudentByID(int id, Student student) {
        Optional<Student> studentDB = studentRepository.findById(id);
        if(studentDB.isEmpty()){
            throw  new DetailsNotFoundException("No Details exists!!");
        }
        else {

            studentDB.get().setName(student.getName());
            studentDB.get().setDateOfBirth(student.getDateOfBirth());
            studentDB.get().setBranch(student.getBranch());
            studentDB.get().setFees(student.getFees());
            studentDB.get().setAge(student.getAge());

            studentRepository.save(studentDB.get());

            return new SucessResponse("Details Updated successfully", studentDB);
        }
    }
}
