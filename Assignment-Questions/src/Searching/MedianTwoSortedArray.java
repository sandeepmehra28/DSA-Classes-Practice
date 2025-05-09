package Searching;

public class MedianTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 ={1,2};
        int[] arr2 ={3,4};
        System.out.println(findTheMedian(arr1,arr2));
    }
    static double findTheMedian(int[] arr1, int[] arr2){
        if(arr1.length>arr2.length){
            return findTheMedian(arr2,arr1);
        }
        int n1 = arr1.length;
        int n2= arr2.length;
        int N=n1+n2;
        int start = 0;
        int end=n1;
        while(start<=end){
            int mid1 =start+(end-start)/2;
            int mid2 =N/2-mid1;
            int l1=(mid1==0)?Integer.MIN_VALUE:arr1[mid1-1];
            int l2=(mid2==0)?Integer.MIN_VALUE:arr2[mid2-1];
            int r1=(mid1==n1)?Integer.MAX_VALUE:arr1[mid1];
            int r2=(mid2==n2)?Integer.MAX_VALUE:arr2[mid2];
            if(l1<r2&&l2<r1){
                if(N%2!=0){
                    return(double) Math.min(r1,r2);
                }else{
                    return ((Math.max(l1,l2)+Math.min(r1,r2))/2.0);
                }
            }else if(l1>l2){
                end=mid1-1;
            }else {
                start=mid1+1;
            }
        }
        return 0.0;
    }
}
