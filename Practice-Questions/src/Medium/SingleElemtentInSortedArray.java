package Medium;

public class SingleElemtentInSortedArray {
    public static void main(String[] args) {
        int[] arr={3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(arr));
    }
    static int singleNonDuplicate(int[] arr) {
        int start =0;
        int end=arr.length-2;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==arr[mid^1]){
                start =mid+1;
            }else{
                end=mid-1;
            }
        }
        return arr[start];
    }
}
