package com.company;

public class practice_ques {

    // recursive function to calculate first n natural numbers:

    static int recSum(int n){
        if(n==1){
            return 1;
        }
        return n + recSum(n-1);
    }
    public static void main(String[] args) {
        int c= recSum(5);
        System.out.println(c);

    }
}
