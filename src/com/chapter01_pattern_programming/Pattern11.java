package com.chapter01_pattern_programming;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n +" X "+i+" = "+n*i);
        }
    }

}
