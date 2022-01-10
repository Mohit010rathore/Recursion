package com.Recursion.Arrays;

import java.util.ArrayList;

public class Recursive_Linear_Search {
    public static void main(String[] args) {
        int[] arr={2,3,1,1,5};
        //System.out.println(Search(arr,9,0));
       // System.out.println(FindIndex(arr,5,0));
        //System.out.println(FindIndexLast(arr,4,arr.length-1));
        FindAllIndex(arr,1,0);
        System.out.println(list);

    }
    public static boolean Search(int [] arr,int target,int index)
    {
        if(index == arr.length)
        {
            return false;
        }
        return arr[index] == target || Search(arr,target,index + 1);
    }

    //if u want to return the index value
    static int FindIndex(int[] arr,int target,int index)
    {
        if(index == arr.length)
        {
            return -1;
        }
        if(arr[index] == target)
        {
            return index;
        }else{
            return FindIndex(arr,target,index+1);
        }
    }

    //if u want to search from last
    static int FindIndexLast(int[] arr,int target,int index)
    {
        if(index == -1)
        {
            return -1;
        }
        if(arr[index] == target)
        {
            return index;
        }else{
            return FindIndexLast(arr,target,index-1);
        }
    }

    //for multiple occurences
    static ArrayList<Integer> list = new ArrayList<>();
    static void FindAllIndex(int[] arr,int target,int index)
    {
        if(index == arr.length)
        {
            return;
        }
        if(arr[index] == target)
        {
            list.add(index);
        }
        FindAllIndex(arr,target,index +1);

    }
}
