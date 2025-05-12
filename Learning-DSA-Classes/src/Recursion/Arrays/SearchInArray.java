package Recursion.Arrays;

import java.util.ArrayList;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,55,6,7,8,8,8,9,10};
        int target =8;
        System.out.println(findAns(arr,target,0));
        System.out.println(findIndex(arr,target,0));
        findIndexUsingArrayList(arr,target,0);
        System.out.println(list);
    }
    static boolean findAns(int[] arr, int target, int index){
        if(index== arr.length){
            return false;
        }
        return arr[index]==target||findAns(arr,target,index+1);
    }
    static int findIndex(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
           return findIndex(arr,target,index+1);
        }
    }
    static ArrayList<Integer> list =new ArrayList<>();
    static void findIndexUsingArrayList(int[] arr, int target, int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findIndexUsingArrayList(arr,target,index+1);
    }
}
