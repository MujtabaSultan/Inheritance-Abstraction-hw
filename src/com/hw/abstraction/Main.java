package com.hw.abstraction;

public class Main {
    public static void main(String[] args) {

        School school = new School("north melon ");

        Teacher teacher1 = new Teacher("ali", "haitham", 45.0);

        ClassRoom class1 = new ClassRoom("primary3", teacher1);

        // Students
        class1.addStudent(new Student("isa", "ahmed", 90));
        class1.addStudent(new Student("salem", "naser", 70));
        class1.addStudent(new Student("noor", "salem", 55));




        school.addClassRoom(class1);
        //school.addClassRoom(class2);

        System.out.println(school);
    }
}
