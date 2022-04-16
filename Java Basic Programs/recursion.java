package com.company;

public class recursion {
    static int factorial(int n) {           //Recursive approach
        if (n == 0 | n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }                                        //.

    static int factorial_iterative(int n) { //Iterative approach
        if (n == 0 | n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) { //1 to n
                product *= i;
            }
            return product;
        }
}
    public static void main(String[] args) {
        int x=6;
        System.out.println("Value of factorial of n is: " + factorial(x));
        System.out.println("Value of factorial of n is: " + factorial_iterative(x));
    }
}
