package BinarySearch;

public class countRotation {
    public static void main(String[] arg) {
        int[] arr = { 4,5,6,7, 8, 9, 1, 2, 3};
        System.out.printf("your array rotate in %d times",countRotation(arr));
    }
    static  int countRotation(int [] arr){
        int count = findPivot(arr);
        return count+1;
    }
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}