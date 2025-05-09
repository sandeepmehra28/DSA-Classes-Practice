package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class insertionSort{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(11);
        list.add(13);
        list.add(5);
        list.add(6);
//        insertionSort2(list);
        System.out.println(list);
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort2(arr);
        System.out.println(Arrays.toString(arr));
    }
   
    static void insertionSort1(int [] arr){
        int n=arr.length;
        for(int i =1;i<n;i++){
            int key =arr[i];
            int j =i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    static void insertionSort2(int[] arr){
        for(int i =1;i<arr.length;i++){
            int current =arr[i];
            int j =i-1;
            while(j>=0&&current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }
}