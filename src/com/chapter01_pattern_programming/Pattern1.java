package com.chapter01_pattern_programming;

import java.util.Scanner;

/*this code is print this pattern
 *
 * *
 * * *
 * * * *
 * * * * *
 */
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
