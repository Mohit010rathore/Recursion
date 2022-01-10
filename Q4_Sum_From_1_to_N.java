package com.Recursion;

public class Q4_Sum_From_1_to_N {
    public static void main(String[] args) {
        int ans=Sum(5);
        System.out.println(ans);

    }
    public static int Sum(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        return n + Sum(n-1);
    }
}
