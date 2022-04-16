package com.company;

public class practice_ques4 {
    static class rect{
        private int length;
        private int breadth;

         public rect() {
            this.length = 12;
            this.breadth = 7;
        }

        public rect(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public int getLength() {
            return length;
        }

        public int getBreadth() {
            return breadth;
        }

    }
    public static void main(String[] args) {
       // rect myRect= new rect(); //This will be used to print already set values
        rect myRect= new rect(21,13); // This will overload the values
        System.out.println(myRect.getBreadth());
        System.out.println(myRect.getLength());

    }
}
