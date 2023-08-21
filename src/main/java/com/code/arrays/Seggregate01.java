package com.code.arrays;  //   

public class Seggregate01{

    public static int[] SeggregateUsingWhile(int[] arr){
        int i=0;
        int j= arr.length-1;
        int temp=0;

        while(i<j){
            if(arr[i] == 0){
                i++;
            }else{
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }

    public static int[] SeggregateUsingFor(int[] arr){
        int j = arr.length-1;
        int temp;

        for (int i = 0; i < j; i++) {          
            if(arr[i] != 0 ){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
                i--;
            }        
        }
       return arr;

    }

    public static void main(String[] args) {

            int[] arr={0,1,1,0,1,0,1,1,0,1,1};

            int[] finalArray = SeggregateUsingWhile(arr);
            int[] finalArray1 = SeggregateUsingFor(arr);

            for (int i = 0; i < finalArray.length; i++) {
                System.out.println(finalArray[i]);
            }

            for (int i = 0; i < finalArray1.length; i++) {
                System.out.println(finalArray1[i]);
            }


       


        
    }
    
}
