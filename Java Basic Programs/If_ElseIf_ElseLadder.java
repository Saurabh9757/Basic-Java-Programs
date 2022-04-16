package com.company;
import java.util.Scanner;

public class If_ElseIf_ElseLadder {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if(age>56) {
            System.out.println("You are Experienced.");
        }
        else if(age>46){
            System.out.println("You are Semi-Experienced.");
        }
        else if(age>36){
            System.out.println("You are Semi-Semi-Experienced.");
        }
        else if(age>26){
            System.out.println("You are not experienced.");
        }
        else{
            System.out.println("You are NOOB.");
        }
    }
}