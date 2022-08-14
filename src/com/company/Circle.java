package com.company;

public class Circle{
    private int pi;

    public static void area(int radius, int pi) {
        System.out.println("Area: " + (pi * (radius * radius)));
    }

    public static void circumference(int pi, int radius) {
        System.out.println("Circumference: " + (pi*2*radius));

    }


}
