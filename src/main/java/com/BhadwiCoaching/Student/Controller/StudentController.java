package com.BhadwiCoaching.Student.Controller;

import com.BhadwiCoaching.Student.Utility.Response;
import com.BhadwiCoaching.Student.Entity.Student;
import com.BhadwiCoaching.Student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("coaching/manage/students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/AddStudents")
    public ResponseEntity<Response> AddStudents(@RequestBody Student student){
        Response response = studentService.AddStudent(student);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/getAllStudent")
    public ResponseEntity<Response> getAllStudent(){

        Response response = studentService.getAllStudent();
        return ResponseEntity.ok(response);
    }

    @GetMapping("studentId/{id}")
    public ResponseEntity<Response> getAllStudent(@PathVariable int id){

        Response response = studentService.getStudentById(id);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/update/studentId/{id}")
    public ResponseEntity<Response> updateStudentById(@PathVariable int id, @RequestBody Student student){
        Response response = studentService.updateStudentByID(id, student);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/deleteAll")
    public ResponseEntity<Response> deleteAddStudent(){
        Response response = studentService.deleteAllStudent();
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete/studentId/{id}")
    public ResponseEntity<Response> deleteAddStudent(@PathVariable int id){
        Response response = studentService.deleteStudentById(id);
        return ResponseEntity.ok(response);
    }



}
