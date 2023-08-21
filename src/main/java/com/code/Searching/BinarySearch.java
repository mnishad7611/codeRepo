package com.code.Searching;     

public class BinarySearch{

    public static int search(int[] arr, int item ){
        int low = 0;
        int high = arr.length-1;
        int mid = (low+high)/2;
        int index = -1;

        while (low <= high){
            if(item == arr[mid]){
                 index =mid;
                 //System.out.println("Element is Present in the array at index : "+ mid);
                 break;
            }
            else if(arr[mid] < item){
                low =mid+1;
            }else{
                 high=mid-1;
            }

            mid =(low+high)/2;
        }     
        // if (low>high){
        //    // System.out.println("Element is not found in the array");
        // }
        return index;


    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,9,14,20};      
        int item =99;

        int result = search(arr,item);
        System.out.println(result);

        
        }   
    }
    

