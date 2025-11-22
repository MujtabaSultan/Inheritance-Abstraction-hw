package com.hw.abstraction;

public class Teacher extends Person implements TeacherRole{
    double salaryRate;
    @Override
    public void teach(String subject) {
        System.out.println("teaching" + subject);
    }

    public Teacher(String fName, String lName) {
        super(fName, lName);
    }

    public Teacher(String fName, String lName ,double salaryRate ) {
        super(fName, lName);
        this.salaryRate=salaryRate;
    }
    public String toString() {
        return fName+" " + lName+ " (Rate: BD " + salaryRate + ")";
    }
}
