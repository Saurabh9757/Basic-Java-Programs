package com.company;
import java.util.Scanner;

public class EnhancedSwitch_Case {

    public static void main(String[] args) {
        String name;
        System.out.print("Enter Student's Name: ");
        Scanner sc = new Scanner(System.in);
        name = sc.next();

        switch (name) {
            case "Ravi" -> System.out.println("Student of BCA.");
            case "Raj" -> System.out.println("Student of BBA.");
            case "Rahul" -> System.out.println("Student of BSC.IT.");
            case "Rohan" -> System.out.println("Student of BBM.");
        }
        System.out.println("CIMAGE Professional College");
    }
}


