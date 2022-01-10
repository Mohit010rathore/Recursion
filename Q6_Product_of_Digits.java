package com.Recursion;

public class Q6_Product_of_Digits {
    public static void main(String[] args) {
        //F(N)=F(N/10) * (N%10)
        int ans= ProductOfDigits(3024);
        System.out.println(ans);

    }
    public static int ProductOfDigits(int n)
    {
        if(n%10 == n) //base condition
        {
            return n;
        }
        return ProductOfDigits(n/10) * (n%10);
    }
}
