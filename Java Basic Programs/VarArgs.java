package com.company;

public class VarArgs{


    /* static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c) {
        return a+b+c;
    }
    static int sum(int a, int b, int c, int d) {
        return a+b+c+d;
    }
    */

    /* Or By Using VarArgs without usage of any compulsory argument:

    static int sum (int...arr){
     //Available as int [] arr;
        int result =0;
        for(int a: arr){
            result +=a;
        }
        return result;
    } */

   // Or By Using VarArgs with usage of any compulsory argument:
   public static int sum (int x, int...arr) {
        //Available as int [] arr;
        int result = x;
        for (int a : arr) {
            result += a;
        }
        return result;
    }
    //.

    public static void main(String[]args){
        System.out.println("Varargs Program");
        System.out.println("The sum of 8 and 7 is: " + sum(8 ,7));
       // System.out.println("The sum of nothing: " + sum());            //run only if there is no compulsory srgument used
        System.out.println("The sum of 8 and 7 is: " + sum(8 ,7));
        System.out.println("The sum of 1 is: " + sum( 1)); //usage of Compulsory argument
        System.out.println("The sum of 8, 6 and 7 is: " + sum(8 ,6, 7));
        System.out.println("The sum of 8, 6, 2 and 7 is: " + sum(8 ,6, 2,7));
    }
}
