package com.chapter03_Arrays;
import java.util.Scanner;

public class Question04SumOf2Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        int n2=sc.nextInt();
        Array arr1=new Array(n1);
        Array arr2=new Array(n2);

        arr1.takeInput();
        arr2.takeInput();


        Array ans=add(arr1,arr2);
        ans.displayArray();
    }
    public static Array add(Array arr1,Array arr2)
    {
        Array ans=new Array(Math.max(arr1.length(), arr2.length()));
        int i=arr1.length()-1;
        int j=arr2.length()-1;
        int k=ans.length()-1;
        int carry=0;
        while(i>=0 && j>=0)
        {
            int sum=arr1.getElement(i)+arr2.getElement(j)+carry;
            ans.updateAtIndex(k,sum%10);
            carry=sum/10;
            i--;
            j--;
            k--;
        }
        while(i>=0)
        {
            int sum=arr1.getElement(i)+carry;
            ans.updateAtIndex(k,sum%10);
            carry=sum/10;
            i--;
            k--;
        }
        while(j>=0)
        {
            int sum=arr2.getElement(j)+carry;
            ans.updateAtIndex(k,sum%10);
            carry=sum/10;
            j--;
            k--;
        }
        if(carry==0)
        {
            return ans;
        }

       Array newAns=new Array(ans.length()+1);
        for (int l = 1; l < newAns.length(); l++) {
            newAns.updateAtIndex(l,ans.getElement(l-1));
        }
        newAns.updateAtIndex(0,carry);
        return newAns;
    }
}
