package com.code.arrays;

public class Sort012 {

    public static int[] Sort012Array(int[] arr ,int size){
        int low=0;
        int mid =0;
        int high = size-1;
        int temp;

        while(mid<high){
            if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]== 0){
                temp=arr[mid];
                arr[mid] = arr[low];
                arr[low] =temp;
                low++;
                mid++;
            }
            else if (arr[mid] == 2){
                temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] =temp;
                high--;

            }
        }
        return arr;

    }

    public static void main(String[] args) {

        int[] arr ={0,1,0,1,2,1,0,2,1};
        int size = 9;
        Sort012Array(arr,size);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Sorted Array : "+arr[i]);          
        }
       
    }
    
}
