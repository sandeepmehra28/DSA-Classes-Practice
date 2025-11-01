package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
public class practice {
    public static void main(String[] args) {
    int[] a = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int m = 5;
        System.out.println(find(a,m));
    }
   static ArrayList<Integer> find(int[] arr, int m)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(firstIndex(arr,m));
        ans.add(lastIndex(arr,m));
        return ans;
    }
    static int firstIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                ans = mid;
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    static int lastIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                ans = mid;
                start = mid+1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }

}