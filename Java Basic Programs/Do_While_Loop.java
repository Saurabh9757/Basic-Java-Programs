package com.company;

public class Do_While_Loop {
    public static void main(String[] args) {
       int a=10;
       do{
           System.out.println(a);
          a++;
       }while (a<=5); // Do While loop will print "a" once
                      // then check the condition and if
                      // conditions meet then continue
                      // to print otherwise it will stop.

       while (a<=5){
           System.out.println(a);
           a++;
                     // While loop will first
                     // check the condition and if
                     // conditions meet then print
                     // otherwise it will stop.
                     // So, nothing will be printed here.
       }
    }
}
