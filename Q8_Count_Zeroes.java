package com.Recursion;

public class Q8_Count_Zeroes {
    public static void main(String[] args) {
        System.out.println(Count(30503000));
    }
    public static int Count(int n)
    {
        return helper(n,0);
    }
    //special example to return same value to above function calls
    public static  int helper(int n,int c)
    {
        if(n==0)
        {
            return c;
        }
        int rem=n%10;
        if(rem==0)
        {
            return helper(n/10,c+1);
        }else{
            return helper(n/10,c);
        }
    }
}
