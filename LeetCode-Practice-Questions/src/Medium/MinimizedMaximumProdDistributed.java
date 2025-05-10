package Medium;

public class MinimizedMaximumProdDistributed {
    public static void main(String[] args) {
        int[] arr={15,10,10};
        int n=7;
        System.out.println(dis(arr,n));
    }
    static int dis(int[] arr,int n){
        int start=1;
        int end=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>end){
                end=i;
            }
        }
        int ans=-1;
        while (start<=end){
            int mid=start+(end+start)/2;
            if(isP(arr,mid,n)){
                ans=mid;
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return ans;
    }
    static boolean isP(int[] arr, int mid, int n){
        int pro=0;
        for(int i:arr){
            pro+=i/mid;
            if(i%mid!=0){
                pro++;
            }if(pro>n){
                return false;
            }
        }
        return true;
    }
}
