package Hard;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr ={7,2,5,10,8};
        int k =2;
        System.out.println(splitArray(arr,k));
    }
    static int splitArray(int[] arr, int k){
        int start=Integer.MIN_VALUE;
        int end = 0;
        for(int i:arr){
            if(i>start){
                start=i;
            }
            end+=i;
        }
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (isp(arr, mid, k)) {
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    static boolean isp(int[] arr, int mid, int k){
        int current =1;
        int page =0;
        for(int i:arr){
            page+=i;
            if(page>mid){
                current++;
                page=i;
            }if(current>k){
                return false;
            }
        }
        return true;
    }
}
