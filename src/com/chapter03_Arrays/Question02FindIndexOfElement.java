package com.chapter03_Arrays;

import java.util.Scanner;

public class Question02FindIndexOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array arr=new Array(sc.nextInt());
        arr.takeInput();
        int element=sc.nextInt();
        System.out.println(findIndex(arr,element));
    }
    public static int findIndex( Array arr, int number)
    {
        for (int i=0;i<arr.length();i++)
        {
            if(arr.getElement(i)==number)
                return i;
        }
        return -1;
    }

}
