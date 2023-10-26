package com.nick.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Benny",18));
        studentList.add(new Student("Frida",19));

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).name);
            System.out.println(studentList.get(i).age);
        }

        Collections.swap(studentList,0,1);

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).name);
            System.out.println(studentList.get(i).age);
        }

    }
}

