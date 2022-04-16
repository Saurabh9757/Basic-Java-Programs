package com.company;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b= false;
        boolean c= true;

        //Logical AND
        if (a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        if (a && c){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }


        //Logical OR
        if (a || b || c){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }


        //Logical Not
        System.out.println("Not(a) is : ");
        System.out.println(!a);
        System.out.println(!b);
        System.out.println(!c);


    }
}
