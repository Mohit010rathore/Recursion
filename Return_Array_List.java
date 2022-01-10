package com.Recursion.Arrays;

import java.util.ArrayList;

public class Return_Array_List {
    public static void main(String[] args) {
        int [] arr={2,3,5,7,7,7};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer>ans = findAllIndex(arr,7,0,list);
        System.out.println(ans);
        //System.out.println(list);

    }
     static ArrayList<Integer> findAllIndex(int[] arr,int target,int index,ArrayList<Integer>list)
     {
         if(index == arr.length)
         {
             return list;
         }
         if(arr[index] == target)
         {
             list.add(index);
         }
         return findAllIndex(arr,target,index + 1,list);
     }
}
