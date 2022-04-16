package com.company;

public class oop_ques1 {
    /*
      Create a class named rectangle with a method to initialise
      its sides, calculating area, perimeter, etc.
   */
    static class rectangle {
        int side1;
        int side2;

        public int area() {
            return side1*side2;
        }

        public int perimeter() {
            return 2*(side1+side2);
        }
    }

    public static void main(String[] args) {
        rectangle rect1 = new rectangle();
        rect1.side1 = 5;
        rect1.side2 = 8;
        System.out.println(rect1.area());
        System.out.println(rect1.perimeter());


    }
}
