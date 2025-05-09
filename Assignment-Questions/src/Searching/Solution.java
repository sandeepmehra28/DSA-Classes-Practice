package Searching;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    static int[] twoSum(int[] nums, int target) {
       int start =0;
       int end=nums.length-1;
       while(start<end){
         int sum = nums[start] + nums[end];
          if(sum==target){
          return new int[]{start+1,end+1};
          }if(sum<target){
            start++;
          }else{
            end--;
          }
       } 
       return new int[]{-1,-1};

    }
}