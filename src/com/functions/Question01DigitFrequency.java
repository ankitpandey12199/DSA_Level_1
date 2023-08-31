package com.functions;

import java.util.Scanner;

public class Question01DigitFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit=sc.nextInt();
        int freq=frequency(n,digit);
        System.out.println(freq);
    }
    public static int frequency(int number ,int digit)
    {
        int count=0;
        while(number!=0)
        {
            int rem=number%10;
            if(rem==digit)count++;
            number/=10;
        }
        return count;
    }
}
