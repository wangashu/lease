package com.wangashu.config;

import java.util.Scanner;

public class TestJava {
    public static void main(String[] args) {

        int[] ints = new int[5];

        int[] intTiger={1,2,3,45,6,6,5,65543,2232,1};
        printMessqge(5);

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " × " + i + " = " + (i * j) + "  "  );
            }
            System.out.println();
        }
    }
    public static void  printMessqge(int n){

        for (int i=1; i<=n;i++){

            for (int k=1;k<= n-i;k++){
                System.out.print(" ");
            }

            for (int j=1;j<= 2*i -1; j++){
                System.out.print("*");
            }

            System.out.println();
        }



    }

}