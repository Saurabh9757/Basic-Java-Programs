package com.company;

public class practice_ques3 {

    /* 1. Create a class "Cylinder" and use getter and setter to set its
        radius & height.
       2. calculate volume and surface area using 1
       3. Use a constructor and solve 1 & 2 */


    static class Cylinder{
        private int radius;
        private int height;

        // Use of Constructor

        public Cylinder(int radius, int height) {
            this.radius = radius;
            this.height = height;
        }

        //.

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
        public double surfaceArea(){
            return  2 * 3.142 * radius * radius + 2 * 3.142 * radius * height;

        }
        public double volume(){
            return 3.142 * radius * radius * height;
        }
    }
    public static void main(String[] args) {

        //While Using Constructor
        Cylinder myCylinder= new Cylinder( 8,16);

        /* While using getter and setter

        Cylinder myCylinder= new Cylinder();
        myCylinder.setHeight(16);
        myCylinder.setRadius(8);

        */

        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
    }
}
