package com.company;

import java.util.Scanner;

public class CalcCgpaFromMarks {
    public static void main(String[] args)
    {
        float m1,m2,m3,m4,m5,cgpa;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks of First Subject: ");
        m1=sc.nextFloat();
        System.out.print("Enter Marks of Second Subject: ");
        m2=sc.nextFloat();
        System.out.print("Enter Marks of Third Subject: ");
        m3=sc.nextFloat();
        System.out.print("Enter Marks of Fourth Subject: ");
        m4=sc.nextFloat();
        System.out.print("Enter Marks of Fifth Subject: ");
        m5=sc.nextFloat();
        cgpa= (m1+m2+m3+m4+m5)/50;
        System.out.print("CGPA: "+cgpa);

    }
}
