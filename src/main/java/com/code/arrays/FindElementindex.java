package com.code.arrays;

public class FindElementindex {

    public static int findElementIndex(int[] arr, int ele){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ele){
                index = i;
                break;
                //return i;
            }          
        }      
        return index;
    }

    public static void printElementIndex(int[] arr , int ele){
        int result = findElementIndex(arr ,ele);
        if(result != -1){
            System.out.println("Element is present in the array at index: " + result);
        }else{
            System.out.println("Element is not present in the array");
        }

    }

    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5,6,7};
        int ele = 7;
        printElementIndex(arr,ele);
        
    }         
  }


    

