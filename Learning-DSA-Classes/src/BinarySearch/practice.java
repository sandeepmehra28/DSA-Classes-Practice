package BinarySearch;

public class practice {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int students = 2;
        int ans = bookAllocation(arr,students);
        System.out.println(ans);
    }
    static  int bookAllocation(int[] arr ,int students){
        int start = Integer.MIN_VALUE;
        int end=0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>start){
               start = arr[i];
            }
            end+=arr[i];
        }
        int res = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(isPossible(arr,mid,students)){
                res = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return res;
    }
    static boolean isPossible(int[] arr, int mid, int students){
        int cu = 1;
        int p = 0;
        for(int i = 0;i< arr.length;i++){
            p+=arr[i];
            if(p>mid){
                cu+=1;
                p = arr[i];
            }
            if(cu>students){
                return false;
            }
        }
        return true;
    }
}