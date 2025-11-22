package com.hw.abstraction;

import java.util.ArrayList;

public class ClassRoom {

    Teacher teacher;
    String className;
    ArrayList<Student>studentList;

    public void getStudentsList(){

    }
    public ClassRoom(String className , Teacher teacher ){
        this.className=className;
        this.teacher=teacher;
        this.studentList=new ArrayList<>();
    }
    public void addStudent(Student student) {
            studentList.add(student);
        }
    public String toString() {
        return "ClassRoom: " + className + "\nTeacher: " + teacher + "\nStudents: " + studentList;
    }
}
