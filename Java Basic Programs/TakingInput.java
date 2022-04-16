package com.company;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From The User");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        //int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.print("Enter second number : ");
        //int b = sc.nextInt();
        float b = sc.nextFloat();
        //int sum = a+b;
        float sum = a+b;
        System.out.print("The Sum of these numbers is : ");
        System.out.println(sum);

    }
}
