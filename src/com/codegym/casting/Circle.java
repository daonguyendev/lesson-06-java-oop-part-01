package com.codegym.casting;

public class Circle extends Shape {
    public Circle(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Parent class";
    }
}
