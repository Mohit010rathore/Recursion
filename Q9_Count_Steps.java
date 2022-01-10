package com.Recursion;

//Given a integer num,return the number of steps to reduce it to zero
//IN ONE STEP, if the current number is even,you have to divide it by 2,otherwise you have to subtract 1 from it

public class Q9_Count_Steps {
    public static void main(String[] args) {
        System.out.println(Count(12));
    }
    public static int Count(int n)
    {

        return helper(n,0);
    }
    public static int helper(int n,int steps)
    {
        if(n==0)
        {
            return steps;
        }
        if(n%2 == 0)
        {
            return helper(n/2,steps+1);
        }
        return helper(n-1,steps+1);
    }
}
