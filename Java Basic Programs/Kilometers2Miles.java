package com.company;

import java.util.Scanner;

public class Kilometers2Miles {
    public static void main(String[]args){
        double kms,miles;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Kms to Convert into Miles: ");
        kms=sc.nextDouble();
        miles= kms*0.621371 ;
        System.out.println(kms+" Kilometers is equal to "+miles+" Miles.");
    }
}
