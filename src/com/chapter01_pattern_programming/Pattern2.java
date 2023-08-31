package com.chapter01_pattern_programming;
/*
  this code is to print the following pattern
  * * * * *
  * * * *
  * * *
  * *
  *
 */
import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
