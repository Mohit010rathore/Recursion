package com.Recursion;

import java.util.Arrays;

public class SelectionSort_Recursion {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        Selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));

    }public static void Selection(int[] arr,int r,int c,int max)
    {
        if(r == 0) {
            return;
        }
        if(c<r)
        {
            if(arr[c] > arr[max])
            {
                Selection(arr,r,c+1,c);
            }else{
                Selection(arr,r,c+1,max);
            }
        //now we have gone through whole row
        }else{
            //now we have max of that row,so swap it with the last index which is r-1
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            Selection(arr,r-1,0,0);

        }
    }
}
