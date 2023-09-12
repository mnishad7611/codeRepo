package com.code.arrays;

public class UnionOfTwoSortedArrays {
    
    public static int[] printUnion(int[] arr1, int[] arr2 ,int m , int n){
    int[] arr3 = new int [m + n];
    int i =0, j=0, k=0;

    while(i< m && j< n){
        if(arr1[i] < arr2[j]) {
            arr3[k] = arr1[i];
            i++;
        }else {
            arr3[k] = arr2[j];
            j++;
        }
        k++;
    }

    if(i < m) {
        for(; i < m ;i++) {
            arr3[k] = arr1[i];
            k++;           
        }
    }

    if(j < n) {
        for(; j < n; j++){
            arr3[k] = arr2[j];
            k++;

        }
    }
    for (int l = 0; l < arr3.length; l++) {
        System.out.print(arr3[l] +" ");           
    }

    return arr3;
}
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6} ;           //Output: Union : {1, 2, 3, 4, 5, 6, 7} 
        int i =0, j =0, k=0;

        int[] arr3 = new int[arr1.length + arr2.length];

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }else{
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }

        if(i < arr1.length){
            for(;i < arr1.length ; i++){
                arr3[k] = arr1[i];
                k++;
            }
        }

        if(j < arr2.length){
            for( ; j< arr2.length; j++){
                arr3[k] = arr2[j];
                k++;
            }
        }
        
        for (int l = 0; l < arr3.length; l++) {
            System.out.print(arr3[l] +" ");           
        }
    }

}