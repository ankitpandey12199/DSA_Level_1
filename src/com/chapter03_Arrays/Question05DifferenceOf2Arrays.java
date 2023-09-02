package com.chapter03_Arrays;

import java.util.Scanner;

public class Question05DifferenceOf2Arrays {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        int n2=sc.nextInt();
        Array arr1=new Array(n1);
        Array arr2=new Array(n2);

        arr1.takeInput();
        arr2.takeInput();


        Array ans=diff(arr1,arr2);
        ans.displayArray();
    }
    public static Array diff(Array arr1,Array arr2)
    {
        Array ans=new Array(Math.max(arr1.length(), arr2.length()));
        int sign=1;
        if(arr1.length()<arr2.length())
        {
            Array temp=arr1;
            arr1=arr2;
            arr2=temp;
            sign=-1;
        }
        int i=arr1.length()-1;
        int j=arr2.length()-1;
        int k=ans.length()-1;
        int carry=0;
        while(i>=0 && j>=0)
        {
           int diff=arr1.getElement(i)-arr2.getElement(j)+carry;
           if(diff<0)
           {
               diff+=10;
               carry=-1;
           }
           else carry=0;
           ans.updateAtIndex(k,diff);
           i--;
           j--;
           k--;
        }
        while(i>=0)
        {
            int diff=arr1.getElement(i)+carry;
            if(diff<0)
            {
                diff+=10;
                carry=-1;
            }
            else carry=0;
            ans.updateAtIndex(k,diff);
            k--;
            i--;
        }
        while(j>=0)
        {
            int diff=arr2.getElement(j)+carry;
            if(diff<0)
            {
                diff+=10;
                carry=-1;
            }
            else carry=0;
            ans.updateAtIndex(k,diff);
            k--;
            j--;
        }
        i=0;
        while(i<ans.length() && ans.getElement(i)==0)
        {
            i++;
        }
        if(i==0)
        {
        ans.updateAtIndex(0,ans.getElement(0)*sign);
        return ans;
        }
        Array newans=new Array(ans.length()-i);

        for(j=0;i<newans.length();i++)
        {
            newans.updateAtIndex(j,ans.getElement(i));
        }
        newans.updateAtIndex(0,sign* newans.getElement(0)*sign);
     return ans;
    }
}
