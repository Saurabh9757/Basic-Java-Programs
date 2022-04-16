package com.company;
import java.util.Scanner;

public class Find_Day {
    public static void main(String[] args) {
        int num;
        System.out.printf("Enter Number of the day: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        switch (num) {
            case 1 -> System.out.println("SUNDAY");
            case 2 -> System.out.println("MONDAY");
            case 3 -> System.out.println("TUESDAY");
            case 4 -> System.out.println("WEDNESDAY");
            case 5 -> System.out.println("THURSDAY");
            case 6 -> System.out.println("FRIDAY");
            case 7 -> System.out.println("SATURDAY");
        }
    }
}
