package com.company;

public class multi_dimension_arrays {
    public static void main(String[] args) {
        int [] students;    // 1-dimensional array
        int [] [] marks; // 2-dimensional array
        marks= new int [2][5];

        marks [0][0]= 480;
        marks [0][1]= 365;
        marks [0][2]= 256;
        marks [0][3]= 490;
        marks [0][4]= 380;

        marks [1][0]= 365;
        marks [1][1]= 415;
        marks [1][2]= 475;
        marks [1][3]= 390;
        marks [1][4]= 499;

        for (int i=0;i<marks.length;i++) {
            for (int j = 0; j < marks[i].length; j++){
                System.out.print(marks[i][j]);
            System.out.print(" ");
        }
        System.out.print("\n");

        }

    }
}
