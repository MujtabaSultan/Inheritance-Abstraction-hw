package com.hw.abstraction;

import java.util.ArrayList;

public class School {
    String campusName;
    ArrayList<ClassRoom> classRoomList;

    public School(String campusName) {
        this.campusName = campusName;
        this.classRoomList = new ArrayList<>();
    }
    public void addClassRoom(ClassRoom classRoom) {
        classRoomList.add(classRoom);
    }

    public String toString() {
        return "School: " + campusName + "\nClassrooms:" + classRoomList;
    }
}
