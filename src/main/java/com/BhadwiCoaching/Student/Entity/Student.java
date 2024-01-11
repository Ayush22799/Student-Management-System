package com.BhadwiCoaching.Student.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotBlank;

@Entity
public class Student {

    @Id
    @GeneratedValue()
    int studentId;
    @NotBlank
    String name;
    @NotBlank
    String dateOfBirth;
    @NotBlank
    String branch;
    @NotBlank
    int age;
    @NotBlank
    int fees;

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
