package Medium;

public class FindPeakIndexInMountainArray {
    public static void main(String[] args) {
   int[] arr={0,10,5,2};
        System.out.println(findIndex(arr));
    }
    static int findIndex(int[] arr){
        int start=0;
         int end=arr.length-1;
         while(start<=end){
             int mid=start+(end-start)/2;
             if(arr[mid]<=arr[mid+1]){
                 start=mid+1;
             }else{
                 end=mid-1;
             }
         }
         return start;
    }

}
