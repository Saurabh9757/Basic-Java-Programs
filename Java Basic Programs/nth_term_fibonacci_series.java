package com.company;

public class nth_term_fibonacci_series {
    static int fib (int n){
       /* if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        } */

        //or

        if (n==1 || n==2){
            return n-1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        int result =fib(8);
        System.out.println(result);

    }
}
