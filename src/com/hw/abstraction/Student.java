package com.hw.abstraction;

public class Student extends Person implements StudentRole {
    double grade;


    public Student(String fName, String lName) {
        super(fName, lName);
    }
    public Student(String fName, String lName , double grade) {
        super(fName, lName);
        this.grade=grade;
    }

    public void learn(){
        System.out.println("learning");
    }
    public String toString() {
        return "Student: " + fName + " " +lName  + " (Grade: " + grade + ")";
    }

}
