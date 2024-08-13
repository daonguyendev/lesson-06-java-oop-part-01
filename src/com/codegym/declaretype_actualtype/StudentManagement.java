package com.codegym.declaretype_actualtype;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentManagement {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Tý"));
        students.add(new Student(2, "Tèo"));
        System.out.println(students);

        LinkedList<Student> studentList = new LinkedList<>();
        for (Student s: students) {
            studentList.add(s);
        }
        System.out.println(studentList);

        List<Student> students1 = new ArrayList<>();
        students1.add(new Student(3, "Thơ"));
        students1.add(new Student(4, "Thiên"));
        System.out.println(students1);

        List<Student> students2 = new ArrayList<>(students1);
        System.out.println(students2);
    }
}
