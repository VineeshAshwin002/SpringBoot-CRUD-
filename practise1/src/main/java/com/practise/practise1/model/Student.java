package com.practise.practise1.model;

import jakarta.persistence.*;

@Table(name = "students")
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int s_id;
    @Column(name="Student_FirstName",nullable = false)
    private String first_Name;
    @Column(name="Student_LastName")
    private String last_Name;

    @Column(name="Year")
    private int year;

    @Column(name="Sem")
    private int sem;

    @Column(name="Department")
    private String Department;

    @Column(name="Cgpa")
    private float cgpa;

    @Column(name="Arrear")
    private int arrear;

    public Student(Student student) {

    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public int getArrear() {
        return arrear;
    }

    public void setArrear(int arrear) {
        this.arrear = arrear;
    }

    public Student(int s_id, String first_Name, String last_Name, int year, int sem, String department, float cgpa, int arrear) {
        this.s_id = s_id;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.year = year;
        this.sem = sem;
        this.Department = department;
        this.cgpa = cgpa;
        this.arrear = arrear;
    }



    @Override
    public String toString() {
        return "Student{" +
                "s_id=" + s_id +
                ", first_Name='" + first_Name + '\'' +
                ", last_Name='" + last_Name + '\'' +
                ", year=" + year +
                ", sem=" + sem +
                ", Department='" + Department + '\'' +
                ", cgpa=" + cgpa +
                ", arrear=" + arrear +
                '}';
    }

    public Student() {
    }
}
