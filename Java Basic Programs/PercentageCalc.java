package com.company;

import java.util.Scanner;

public class PercentageCalc {
    public static void main(String[] args) {
        int s1, s2, s3, s4, s5, tm;
        double pt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 5 Subjects");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        s4 = sc.nextInt();
        s5 = sc.nextInt();
        tm = s1 + s2 + s3 + s4 + s5;
        pt = tm / 5.0;
        System.out.println("Total Marks Obtained: "+tm);
        System.out.println("Percentage: "+pt);
    }
}
