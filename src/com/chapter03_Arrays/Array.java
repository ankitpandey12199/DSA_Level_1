package com.chapter03_Arrays;

import java.util.Scanner;

public class Array {
    private Scanner sc;
    private int []arr;
    Array(int n)
    {
        arr=new int [n];
        sc=new Scanner(System.in);
    }
    public void takeInput()
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    public void displayArray()
    {
        for (int a:arr) {
            System.out.print(a+" ");
        }
        System.out.println();
    }
    public int getElement(int index)
    {
        if(index>=arr.length){
            System.out.println("Invalid index");
            return -1;
        }
        return arr[index];
    }
    public int findMin()
    {
        int min=Integer.MAX_VALUE;
        for(int a:arr)
        {
            if(min>a)min=a;
        }
        return min;
    }
    public int findMax()
    {
        int max=Integer.MIN_VALUE;
        for(int a:arr)
        {
            if(max<a)max=a;
        }
        return max;
    }
}
