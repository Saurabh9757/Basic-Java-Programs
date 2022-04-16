package com.company;

public class oop_ques2 {
    /*
  Create a class named circle with a method to initialise
  its radius, calculating area, circumference, etc.
*/
    static class circle {
        int radius;

        public float area() {
            return 3.14f*(radius*radius);
        }

        public float circumference() {
            return 2*3.14f*radius;
        }
    }

    public static void main(String[] args) {
        circle circle1 = new circle();
        circle1.radius = 7;
        System.out.println(circle1.area());
        System.out.println(circle1.circumference());


    }
}
