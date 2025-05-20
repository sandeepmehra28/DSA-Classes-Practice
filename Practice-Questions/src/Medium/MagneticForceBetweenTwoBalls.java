package Medium;

public class MagneticForceBetweenTwoBalls {
    public static void main(String[] args) {
       int[] arr={1,2,3,4,7};
       int m =3;
        System.out.println(maxDistance(arr,m));
    }
    static int maxDistance(int[] position, int m) {
     int start=1;
     int end=position[position.length-1]-position[0];
     int ans=-1;
     while(start<=end){
         int mid=start+(end-start)/2;
         if(isP(position,mid,m)){
             ans=mid;
             start=mid+1;
         }else{
             end=mid-1;
         }
     }
     return ans;
    }
    static boolean isP(int[] po, int mid,int m){
        int d=1;
        int p=po[0];
        for (int i = 1; i <po.length ; i++) {
            if(po[i]-p>=mid){
                d++;
                p=po[i];
            }if(d>=m){
                return true;
            }

        }
        return false;
    }
}
