package com.code.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IntersectionOfTwoSortedArrays {

    public static int[] intersectionOFTwoArraysUsingSet(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();
        List<Integer> list =new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);       
        }

        for (int j = 0; j < arr2.length; j++) {
            if(set.contains(arr2[j])){
                list.add(arr2[j]);
            }       
        }

        int[] result = new int[list.size()] ;
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;

    }


    public static void main(String[] args) {

        int arr1[] = {2, 4, 5, 6, 8};
        int arr2[] = {4, 6, 8, 10};

        int[] resulted = intersectionOFTwoArraysUsingSet(arr1,arr2);
        
        for(int i : resulted){
            System.out.println("Intersected elements : "+ i);
        }
    }
    
}


class Intersection{
    public static void intersectionOfArraysUsingMap(int[] a, int[] b){
        Map<Integer,Integer> map = new HashMap<>();
        
        for (int i = 0; i < a.length; i++) {
            map.put(a[i],1);           
        }

        for (int j = 0; j < b.length; j++) {
            if(map.containsKey(b[j])){
                System.out.println("Intersection " +b[j]);
            }           
        }
    }

    public static void intersectionOFTwoArraysUsingBruteForce(int[] arr1, int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    System.out.println("Intersection of Two Sorted Arrays are : "+arr2[j]);
                    break;
                }
            }           
        }
    }
}






       
 
