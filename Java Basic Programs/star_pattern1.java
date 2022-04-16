package com.company;

public class star_pattern1 {

    /*      *
            **
            ***
            ****          */

  /*  static void pattern1(int n){
        for(int i=0;i<n; i++) {
            for (int j =0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         pattern1(4);
    }    */

    //Using Recursion

  static void pattern1_rec(int n){
      if (n>0){
          pattern1_rec(n-1);
          for (int i =0; i<n; i++) {
              System.out.print("*");
          }
          System.out.println();
      }

      }
    public static void main(String[] args) {
        pattern1_rec(4);
    }
}
