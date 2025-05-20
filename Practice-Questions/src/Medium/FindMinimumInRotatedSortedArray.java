package Medium;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
    int[] arr ={11,13,15,17};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr) {
        int start = 0;
        int end= arr.length-1;
        int minValue = Integer.MAX_VALUE;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[start]<=arr[mid]){
                minValue = Math.min(minValue,arr[start]);
                start= mid+1;
            }else{
                minValue = Math.min(minValue,arr[mid]);
                end = mid-1;
            }
        }
        return minValue;
    }
}
