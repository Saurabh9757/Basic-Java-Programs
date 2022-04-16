package com.company;

import java.util.Scanner;

public class CalcCgpaFromSgpa {
    public static void main(String[] args) {
        float sem1,sem2,sem3,sem4,sem5,sem6,cgpa;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the SGPA of Sem1: ");
        sem1 = sc.nextFloat();
        System.out.print("Enter the SGPA of Sem2: ");
        sem2 = sc.nextFloat();
        System.out.print("Enter the SGPA of Sem3: ");
        sem3 = sc.nextFloat();
        System.out.print("Enter the SGPA of Sem4: ");
        sem4 = sc.nextFloat();
        System.out.print("Enter the SGPA of Sem5: ");
        sem5 = sc.nextFloat();
        System.out.print("Enter the SGPA of Sem6: ");
        sem6 = sc.nextFloat();
        cgpa= (sem1+sem2+sem3+sem4+sem5+sem6)/6;
        System.out.print("CGPA: "+cgpa);
    }
}
