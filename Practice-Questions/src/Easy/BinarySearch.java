package Easy;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        int target = 9;
        System.out.println(findBS(arr,target));
    }
    static int findBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                ans=mid;
                return ans;
            } else if (target< arr[mid]) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}
