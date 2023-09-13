package com.code.arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6,8};

        int[] arr3 = mergeTwoArraysUsingThirdArray(arr1,arr2);

        for(int i : arr3 ){
            System.out.println("Elements : " + i );
        }
        
    }
    
    public static int[] mergeTwoArraysUsingThirdArray(int[] arr1, int[] arr2){

        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];           
        }

        for (int j = 0; j < arr2.length; j++) {
            arr3[arr1.length + j] = arr2[j];            
        }
        
        return arr3;

    }

    public static int[] mergeTwoArraysUsingList(int[] arr1, int[] arr2){
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);           
        }

         for (int j = 0; j < arr2.length; j++) {
            list.add(arr2[j]);            
        }

        int[] arr3 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr3[i] = list.get(i);
            
        }

        return arr3;

    }

}
