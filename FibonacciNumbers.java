package com.Recursion;

public class FibonacciNumbers {
    public static void main(String[] args) {
        //int ans=Fibonacci(4);
        //System.out.println(ans);
        for(int i=0; i<11;i++)
        {
            System.out.println(FiboFormula(i));
        }
    }
    static int Fibonacci(int n){

        //base condition
        if(n < 2)
        {
            return n;
        }

        return Fibonacci(n-1) + Fibonacci(n-2);
    }
//Finding nth fibonacci Number using Golden Ratio
    static int FiboFormula(int n){

        return (int)(Math.pow(((1+Math.sqrt(5)) / 2),n) / Math.sqrt(5));
    }
}
