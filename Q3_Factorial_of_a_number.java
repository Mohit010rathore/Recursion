package com.Recursion;

public class Q3_Factorial_of_a_number {
    public static void main(String[] args) {
        int ans=Factorial(4);
        System.out.println(ans);

    }
    public static int Factorial(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        return n * Factorial(n-1);
    }
}
