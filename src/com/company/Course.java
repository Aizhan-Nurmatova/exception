package com.company;

public class Course {
    private String nameOfCourse;
    private String address;
    private Student[] students;

    public Course(String nameOfCourse, String address, Student[] students) {
        this.nameOfCourse = nameOfCourse;
        this.address = address;
        this.students = students;
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students)  {
                this.students = students;
    }

    @Override
    public String toString() {
        return "name Of Course: '" + nameOfCourse + '\'' +
                " address: '" + address + '\'' +
                " \nstudents : ";
    }
}