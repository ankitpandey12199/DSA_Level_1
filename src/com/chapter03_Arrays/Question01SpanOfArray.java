package com.chapter03_Arrays;

import java.util.Scanner;

/*
  This code is to find span of a number
  span=max-min element in the array
 */
public class Question01SpanOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Array arr=new Array(n);
        arr.takeInput();
        int span=arr.findMax()-arr.findMin();
        System.out.println(span);
    }

}
