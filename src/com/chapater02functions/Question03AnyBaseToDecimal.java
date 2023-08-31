package com.chapater02functions;

import java.util.Scanner;

public class Question03AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int base=sc.nextInt();
        System.out.println(anyBaseToDecimalConvertor(number , base));
    }
    public static int anyBaseToDecimalConvertor(int number,int base)
    {
        int ans=0;
        int val=1;
        while(number!=0)
        {
            int rem=number%10;
            ans+=rem*val;
            val*=base;
            number/=10;
        }
        return ans;
    }
}
