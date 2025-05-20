package Medium;

public class FindTheSmallestDivisorGivenThreshold {
    public static void main(String[] args) {
      int[] nums={44,22,33,11,1};
      int threshold=5;
        System.out.println(smallestDivi(nums,threshold));
    }
    static int smallestDivi(int[] arr, int thre){
        int start=1;
        int end=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>end){
                end=i;
            }
        }
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isP(arr,mid,thre)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    static boolean isP(int[] arr, int mid, int r){
        int t =0;
        for (int i = 0; i < arr.length; i++) {
            t+=arr[i]/mid;
            if(arr[i]%mid!=0){
                t++;
            }if(t>r){
                return false;
            }
        }
        return true;
    }

}
