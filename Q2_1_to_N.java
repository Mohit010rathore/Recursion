package com.Recursion;

public class Q2_1_to_N {
    public static void main(String[] args) {
        funRev(5);

    }
    public static void funRev(int n)
    {
        if(n==0)
        {
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
}
