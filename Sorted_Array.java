package com.Recursion.Arrays;

public class Sorted_Array {
    public static void main(String[] args) {
        int[] arr={2,3,5,7,9,11};
        System.out.println(sorted(arr,0));

    }
    //we are using the concept of linear search here
    public static boolean sorted(int [] arr,int index)
    {
        //base condition-> if u are at last position
        if(index == arr.length-1)
        {
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr,index + 1);
    }
}
