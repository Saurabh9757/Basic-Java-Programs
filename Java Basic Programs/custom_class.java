package com.company;
class Student{
    String name;
    int id;
    int rollno;
    int batch;
    String course;
    public void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Roll No: "+rollno);
        System.out.println("Batch: "+batch);
        System.out.println("Course: "+ course);
    }

}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("STUDENTS DATABASE");
        System.out.println();

        //Instantiating a new Student object
        Student saurabh = new Student();
        Student shubham = new Student();

        //Setting Attributes for student objects
        saurabh.name = "Saurabh Kumar Suman";
        saurabh.id = 9757;
        saurabh.rollno = 22;
        saurabh.batch= 2;
        saurabh.course = "BCA";

        shubham.name = "Shubham Kumar Suman";
        shubham.id = 9486 ;
        shubham.rollno =25;
        shubham.batch= 1;
        shubham.course = "BCA";

        //Printing the Attributes

        /*
         System.out.println(Saurabh.name);
         System.out.println(Saurabh.id);
         System.out.println(Saurabh.course);
        */

        //or
        saurabh.printDetails();
        System.out.println();
        shubham.printDetails();




    }
}
