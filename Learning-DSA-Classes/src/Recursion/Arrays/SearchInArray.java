package Recursion.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,55,6,7,8,8,8,9,10};
        int target =8;
/*
        System.out.println(findAns(arr,target,0));
        System.out.println(findIndex(arr,target,0));
        findIndexUsingArrayList(arr,target,0);
        System.out.println(list);
*/
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findIndexUsingArrayList1(arr,target,0,list);
        System.out.println(ans);
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
    static ArrayList<Integer> findIndexUsingArrayList1(int[] arr, int target, int index,ArrayList<Integer>list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
       return findIndexUsingArrayList1(arr,target,index+1,list);
    }
}
