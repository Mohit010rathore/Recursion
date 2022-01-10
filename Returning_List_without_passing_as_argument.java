package com.Recursion.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Returning_List_without_passing_as_argument {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,6};
        System.out.println(findAllIntegers2(arr,4,0));

    }
    static ArrayList<Integer> findAllIntegers2(int[] arr,int target,int index)
    {
        //creating a new arraylist
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length)
        {
            return list;
        }
        //this will contain answer for that function call only
        if(arr[index] == target)
        {
            list.add(index);
        }
        //ansFromBelow will contain the answers that are coming from below
        ArrayList<Integer> ansFromBelowCalls = findAllIntegers2(arr,target,index+1);

        //add all the answers till now
        list.addAll(ansFromBelowCalls);

        return list;
    }
}
