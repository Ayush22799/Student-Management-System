package com.BhadwiCoaching.Student.Entity;


import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotBlank;

@Entity(name = "Student_Detail")
public class Student {

    @Id
    @GeneratedValue()
    private int studentId;
    @NotBlank
    @Column
    private String name;
    @NotBlank
    @Column
    private String dateOfBirth;
    @NotBlank
    @Column
    private String branch;
    @NotBlank
    @Column
    private int age;
    @NotBlank
    @Column
    private int fees;

    public Student(String name, String dateOfBirth, String branch, int age, int fees){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.branch = branch;
        this.age = age;
        this.fees = fees;
    }

    public Student(){

    }

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getFees() {
        return fees;
    }
    public void setFees(int fees) {
        this.fees = fees;
    }
}
