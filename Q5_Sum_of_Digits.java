package com.Recursion;

public class Q5_Sum_of_Digits {
    public static void main(String[] args) {
        //F(N)=F(N/10) + (N%10)
        int ans=SumOfDigits(324);
        System.out.println(ans);

    }
    public static int SumOfDigits(int n)
    {
        if(n==0) //base condition
        {
            return 0;
        }
        return SumOfDigits(n/10) + (n%10);
    }
}
