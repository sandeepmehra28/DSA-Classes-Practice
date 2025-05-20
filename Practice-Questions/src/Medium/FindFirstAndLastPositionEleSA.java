package Medium;

import java.util.Arrays;

public class FindFirstAndLastPositionEleSA {
    public static void main(String[] args) {
        int[] arr ={5,7,7,8,8,1};
        int target=8;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }
    static int[] searchRange(int[] arr, int target){
         int first = findIndex(arr,target,true);
         int last= findIndex(arr,target,false);
         return new int[]{first,last};
     }
     static int findIndex(int[] arr, int target, boolean isA){
        int start=0;
         int end=arr.length-1;
         int ans=-1;
         while(start<=end){
             int mid=start+(end-start)/2;
             if(target==arr[mid]){
                 ans=mid;
                 if(isA){
                     end=mid-1;
                 }else{
                     start=mid+1;
                 }
             }else if(target<arr[mid]){
                 end=mid-1;
             }else{
                 start=mid+1;
             }
         }
         return ans;
     }
}
