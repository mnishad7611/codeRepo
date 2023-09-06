package com.code.arrays;

public class MoveNegativeElements {
    public static void main(String[] args) {

        int[] arr = {1,-1,2,3,-2,6,-7,-4};           // -2,-1,3,2,1
        int size =arr.length;
        int[] a = moveNegativeNumbers(arr,size);
  
        for (int i = 0; i < a.length; i++) {
            System.out.println("Moved  :" + a[i]);          
        }    
    }

    public static int[] moveNegativeNumbers(int[] arr, int size){
        int i =0;
        int j = size-1;

        while(i < j){
            if(arr[i] < 0){              
                i++;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
                j--;
            }
        }
        return arr;
    }   
}
