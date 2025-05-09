package Sorting;

import java.util.Arrays;

public class brickSort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,3,2,9,1,1,0,0};
        brSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void brSort(int[] arr){
        boolean is =false;
        int n =arr.length-2;
        while(!is){
            boolean isS =false;
            for(int i =0;i<n;i+=2){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                    isS=true;
                }
            }
            printArray(arr,"after even swap");
            for(int i =1;i<n;i+=2){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                    isS=true;
                }
            }
            if(!isS){
                is  = true;
//                break;
            }
            printArray(arr,"After odd swap");
        }
    }
    public static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void printArray(int arr[], String message){
        System.out.println("Printing " + message);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }
}