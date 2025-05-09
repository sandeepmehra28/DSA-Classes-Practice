package Searching;

import java.util.Arrays;

public class Aggressivecows {
    public static void main(String[] args) {
        int[] stalls ={1, 2, 4, 8, 9};
        Arrays.sort(stalls);
        int cows=3;
        System.out.println(Distense(stalls,cows));
    }
    static int Distense(int[] arr, int cows){
        int start=0;
        int end=arr[arr.length-1]-arr[0];
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isP(arr,mid,cows)){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    static boolean isP(int[] arr, int mid, int cows){
        int c =1;
        int p =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]-p>=mid){
                c++;
                p=arr[i];
            }
            if(c>=cows){
                return true;
            }
        }
        return false;
    }
}
