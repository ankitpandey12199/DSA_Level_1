package com.chapter03_Arrays;

import java.util.Scanner;

public class Question03BarChart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Array arr=new Array(n);
        arr.takeInput();
        print(arr);
    }
    public static void print(Array arr)
    {
        int max=arr.findMax();
        for (int i =max; i>=1; i--) {
            for (int j = 0; j < arr.length(); j++) {
                if(arr.getElement(j)>=i)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
