package com.code.arrays;

public class ReverseArray {
    public static int[] reverseUsingExtraArray(int[] arr) {       
        int n = arr.length;
        int[] arr2 = new int[n];
        int j =0;

        for (int i = n-1; i >= 0 ; i--) {
            //arr2[n-1-i] = arr[i];
            arr2[j] = arr[i];
            j++;            
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
            
        }
        return arr;
        
    }

    public static int[] reverseUsingTwoPointers(int[] arr){
        int n = arr.length;
        int i =0; int j = n-1; int temp =0;

        while(i <= j){           
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
        return arr;
        
    }

    public static void reverseUsingForLoop(int[] arr){
        int n = arr.length;
        int temp =0;

       for (int i = 0; i < n/2 ; i++) {
            temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;            
       }      
            
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }       

    }

    public static String reverseString(String str){
        char[] ch = str.toCharArray();
        int len = ch.length;
        int i =0; int j = len-1; char temp ;

        while(i < j){
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }

        for (int k = 0; k < ch.length; k++) {
            System.out.println(ch[k]);
        }

        String string  = new String(ch);

        return string;
    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};

        reverseUsingTwoPointers(arr);
        reverseUsingForLoop(arr);
        
        reverseString("Monika");
    }
    
}
