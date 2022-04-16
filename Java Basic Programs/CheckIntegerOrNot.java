package com.company;

import java.util.Scanner;

public class CheckIntegerOrNot {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        System.out.println(sc.hasNextInt());
    }
}
