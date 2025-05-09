package Searching;
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
//but i pick the array because im just practice approach
public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr={0,1,2,4,2,1};
        int target =3;
        System.out.println(inMountain(arr,target));
    }
    static int inMountain(int[] arr, int target){
        int n =arr.length;
        int peak = findPeak(arr);
        int result = bs(arr,target,0,peak,true);
        if(result!=-1){
            return result;
        }
        return bs(arr,target,peak+1,n-1,false);
    }
    static int findPeak(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int  mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }
    static int bs(int[] arr, int target, int start,int end ,boolean isA){
        while(start<=end){
          int mid =start+(end-start)/2;
          if(target==arr[mid]){
              return mid;
          }
          if(isA){
              if(target<arr[mid]){
                  end=mid+1;
              }else{
                  start=mid+1;
              }
          }else{
              if(target>arr[mid]){
                  start=mid+1;
              }else{

                  end=mid+1;
              }
          }
        }
        return -1;
    }
}
