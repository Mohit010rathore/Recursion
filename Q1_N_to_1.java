package com.Recursion;

public class Q1_N_to_1 {
    public static void main(String[] args) {
        fun(5);
    }
    public static void fun(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
}
