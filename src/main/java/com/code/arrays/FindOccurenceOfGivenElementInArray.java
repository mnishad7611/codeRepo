package com.code.arrays;

public class FindOccurenceOfGivenElementInArray {

    public static int findOccurenceOfSpecifiedElement(int[] arr, int ele){

        int counter =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ele){
                //counter = counter+1;
                counter++;
            }       
        }
        return counter;

    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,4,5,4,4};
        int ele =4;
        int result =findOccurenceOfSpecifiedElement(arr,ele);
        System.out.println("No Of Ocurences : "+result);
        
    }
    
}
