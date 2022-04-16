package com.company;

public class oop_ques {
    /*
       Create a class named square with a method to initialise
       its side, calculating area, perimeter, etc.
    */
    static class square {
        int side;

        public int area() {
            return side * side;
        }

        public int perimeter() {
            return 4 * side;
        }
    }

    public static void main(String[] args) {
        square sq4 = new square();
        sq4.side = 5;
        System.out.println(sq4.area());
        System.out.println(sq4.perimeter());


    }
}

