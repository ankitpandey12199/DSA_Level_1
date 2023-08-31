package com.chapter02_functions;

import java.util.Scanner;

public class Question04AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        int currBase=sc.nextInt();
        int newBase=sc.nextInt();
        System.out.println(anyBaseToAnyBaseConvertor(number,currBase,newBase));
    }
    public static int anyBaseToAnyBaseConvertor(int number,int currBase,int newBase)
    {
        //we will convert current base to decimal
        //then we will convert that decimal to desired base

        int decimalValue=Question03AnyBaseToDecimal.anyBaseToDecimalConvertor(number,currBase);
        int newBasevalue=Question02DecimalToAnyBase.decimalToAnyBase(decimalValue,newBase);
        return newBasevalue;
    }
}
