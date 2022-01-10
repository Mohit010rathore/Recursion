package com.Recursion;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        int n;
        print(1);
    }

    static void print(int n) {
        if(n==5)
        {
            System.out.println(n);
            return ;
        }

        System.out.println(n);

        //recursive call
        //if u are calling a function again and again,you can treat is as a separate call in a stack
        //it will take memories separate for every call
        print(n+1);
    }
}
