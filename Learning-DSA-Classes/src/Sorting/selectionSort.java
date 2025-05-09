package Sorting;

import java.util.Arrays;

public class selectionSort {
public static void main(String[] args) {
    int[] arr = {64, 25, 12, 22, 11};
   selSort2(arr);
   System.out.println(Arrays.toString(arr));
}   
    static void selSort1(int[] arr){
    for(int i =0;i<arr.length;i++){
        int minv =arr[i];
        int index = i;
        for(int j =i+1;j<arr.length;j++){
            if(minv>arr[j]){
                minv = arr[j];
                index = j;
            }
        }
        int temp =arr[i];
        arr[i]=arr[index];
        arr[index]=temp;
    }
} 
   static void selSort2(int[]arr){
    for(int  i=0;i<arr.length;i++){
        int in =i;
        for(int j =i+1;j<arr.length;j++){
            if(arr[j]<arr[in]){
                in=j;
            }
        }
        int temp =arr[in];
         arr[in]=arr[i];
         arr[i]=temp;
    }
   }
}