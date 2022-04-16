package com.company;
import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        int sem;
        System.out.println("Enter Semester (1 to 6): ");
        Scanner sc = new Scanner(System.in);
        sem = sc.nextInt();

        switch(sem){
            case 1:
                System.out.println("You will learn Python.");
                break;
            case 2:
                System.out.println("You will learn C language.");
                break;
            case 3:
                System.out.println("You will learn C++ and Java.");
                break;
            case 4:
                System.out.println("You will learn about Data Structure.");
                break;
            case 5:
                System.out.println("You will learn VB .Net and ERP");
                break;
            case 6:
                System.out.println("You will work on a Project.");
                break;
            default:
                System.out.println("There are only 6 semesters in BCA.");

        }
        System.out.println("Best of Luck!");
    }
}


