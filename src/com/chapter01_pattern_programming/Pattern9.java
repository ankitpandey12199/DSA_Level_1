package com.chapter01_pattern_programming;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val=1;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(val++ +" ");
            }
            System.out.println();
        }
    }
}
