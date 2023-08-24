package com.code.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindSubArrayWithGivenSum {
        int first_index;
        int second_index;
        int first_value;
        int second_value;

        public  List<FindSubArrayWithGivenSum> findSubarray(int[] arr, int sum){
            List<FindSubArrayWithGivenSum> list =new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++){
                    if(arr[i]+arr[j] == sum){ 
                        FindSubArrayWithGivenSum ob = new FindSubArrayWithGivenSum();
                        ob.first_value=arr[i];
                        ob.second_value=arr[j];
                        ob.first_index = i;
                        ob.second_index =j;    
                        list.add(ob) ;          
                    }               
                }   
            }   
            return list;
        }
        

        @Override
        public String toString() {
            return "Index i:" +this.first_index + " j:" + this.second_index + " Value " + this.first_value + ":" +this.second_value;
        }


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum =9;
        FindSubArrayWithGivenSum ob=new FindSubArrayWithGivenSum();
        List<FindSubArrayWithGivenSum> lists =ob.findSubarray(arr,sum);

        for(FindSubArrayWithGivenSum obj : lists){
            // System.out.println("Indices : "+obj.first_index +" "+obj.second_index);
            // System.out.println("Elements: "+obj.first_value +" "+obj.second_value);
            System.out.println(obj);
            
        }


        // for (int i = 0; i < arr.length; i++){
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[i]+arr[j] == sum){
        //             System.out.println("Subarray : "+arr[i] +" "+arr[j]);
        //         }
        //     }          
        // }      
    }
    
}
