package com.chapter02functions;

import java.util.Scanner;

public class Question02DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int base=sc.nextInt();
        Question02DecimalToAnyBase obj=new Question02DecimalToAnyBase();
        System.out.println( obj.decimalToAnyBase(number,base));

    }
    public static  int  decimalToAnyBase(int number ,int base)
    {
        int ans=0;
        int pos=1;
        while(number!=0)
        {
            int rem=number%base;
            ans+=pos*rem;
            pos*=10;
            number/=base;
        }
        return ans;
    }
}
