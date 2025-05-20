package Medium;

public class CapacityToShipPackagesWithinD_Days {
    public static void main(String[] args) {
      int[] weights ={1,2,3,4,5,6,7,8,9,10};
      int days = 5;
        System.out.println(findCapacity(weights,days));
    }
    static int findCapacity(int[] arr, int days){
        int start = Integer.MIN_VALUE;
        int end = 0;
        for (int i:arr){
            if(i>start){
                start=i;
            }
            end+=i;
        }
        int ans=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(isP(arr,mid,days)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    static boolean isP(int[] arr, int mid, int days){
        int t =1;
        int p =0;
        for(int i:arr){
            p+=i;
            if(p>mid){
                t++;
                p=i;
            }if(t>days){
                return false;
            }
        }
        return true;
    }

}
