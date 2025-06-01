package Basic_Questions;

public class PerfectSquare {
    public static void main(String[] args) {
        long sq = 49
                ;
        System.out.println(isSq(sq));
    }
    static boolean isSq(long n){
        if(n<=1){
            return true;
        }
        long start =1;
        long end =n;
        while(start<=end){
            long mid = start+(end-start)/2;
            long squ = mid*mid;
            if(squ==n){
                return true;
            } else if (squ<n) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
}
