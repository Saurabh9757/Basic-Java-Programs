package com.company;

public class Operators {
    public static void main(String[]args){
        //1. Arithmetic Operators
        int a= 4;
        // int b = 6 % a;  //Modulo Operator
        // 4.8 % 1.1 --> Returns Decimal Remainder

        //2. Assignment Operators
        int b = 9;
        // b += 3;
        b *= 3;
        System.out.println(b);

        //3. Comparison Operators
        System.out.println(6==8);
        System.out.println(64>6);

        //4. Logical Operators
        System.out.println(64>6 && 64<8);
        System.out.println(64>5 || 64<8);

        //5. Bitwise Operators
        //      10
        //      11
        //     _____
        //      10
        System.out.println(2&3);

    }
}
