package Medium;

public class KoKoEatingBanans {
    public static void main(String[] args) {
        int[] piles={30,11,23,4,20};
        int h =5;
        System.out.println(minEatingB(piles,h));
    }
    static int minEatingB(int[] piles, int h){
        int start=1;
        int end=Integer.MIN_VALUE;
        int ans=-1;
        for (int i:piles){
            if(i>end){
                end=i;
            }
        }
        while (start<=end){
            int mid=start+(end-start)/2;
            if(isP(piles,mid,h)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    static boolean isP(int[] piles, int mid, int h){
        int time=0;
        for (int i = 0; i < piles.length; i++) {
            time+=piles[i]/mid;
            if(piles[i]%mid!=0){
                time++;
            }if(time>h){
                return false;
            }
        }
        return true;
    }
}
