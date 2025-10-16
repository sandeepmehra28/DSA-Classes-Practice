package ArraysJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        System.out.println("Original Array: "+Arrays.toString(arr));
        re(arr);
        System.out.println("After reverse: "+Arrays.toString(arr));


    }
    static void re(int[] arr){
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int start = m+1;
        int end = arr.size()-1;
        while (start<=end){
            Collections.swap(arr,start,end);
            start++;
            end--;
        }
    }
}
