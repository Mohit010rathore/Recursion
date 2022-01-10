package com.Recursion;

public class Q7_Reverse_a_Number {
    public static void main(String[] args) {
        System.out.println(reverse2(2314));
    }
    //Way 1
    static int sum = 0;
    public static void reverse1(int n)
    {
        if(n==0)
        {
            return;
        }
        int rem=n%10;
        sum=sum * 10 + rem;
        reverse1(n/10);
    }

    //Way 2
    public static int reverse2(int n)
    {
        //sometimes you might  need some additional variables in the argument
        //in that case,make another function
        int digits=(int)(Math.log10(n)) + 1;
        return helper(n,digits);
    }

    public static int helper(int n, int digits) {
        if(n%10 == n)
        {
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10,digits-1)) + helper(n / 10,digits-1);
    }
}
