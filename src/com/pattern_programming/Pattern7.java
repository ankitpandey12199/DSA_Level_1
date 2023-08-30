package com.pattern_programming;
//this code is for patter 7 and 8 that is digonal pattern printing
import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if(j==i) System.out.println("*");
                else System.out.print(" ");
            }
        }
    }
}
