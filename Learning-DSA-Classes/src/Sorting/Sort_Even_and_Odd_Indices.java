package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_Even_and_Odd_Indices {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        evenOrOdd(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] evenOrOdd(int[] arr){
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i =0;i< arr.length;i++){
            if(i%2==0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
        int evenIndex=0,oddIndex=0;
        for(int i =0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=even.get(evenIndex++);
            }else{
                arr[i]=odd.get(oddIndex++);
            }
        }
        return arr;
    }
}