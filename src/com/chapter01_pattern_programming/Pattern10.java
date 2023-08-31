package com.chapter01_pattern_programming;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val1=0,val2=1,val3=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(val3+" ");
                val1=val2;
                val2=val3;
                val3=val1+val2;
            }
            System.out.println();
        }
    }
}
