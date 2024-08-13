package com.codegym.casting;

public class CastingManagement {

    public static void main(String[] args) {
        //Implicit casting
        Object obj = new Circle("Quốc");
        Shape shape = new Circle("Sử");
        System.out.println(obj);
        System.out.println(shape);

        //Explicit casting
        Circle circle = (Circle) shape;
        System.out.println(circle);

        Student student = new Student(1, "Tồ");
        if (circle instanceof Circle){
            System.out.println("circle is Circle type");
        }
//        if (student instanceof Circle){//error
//            System.out.println("student is Circle type");
//        }

        //get type of class want to check
        System.out.println(student.getClass());
    }
}
