package com.Recursion;

public class Concept_Passing_Number {
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
        //fun(n--);
        fun(--n);
        //n-- vs --n
        //n-- => this pass the value of n first and subtract it afterwards..it is not subtracting
        // --n => subtract first,and then pass
    }
}
