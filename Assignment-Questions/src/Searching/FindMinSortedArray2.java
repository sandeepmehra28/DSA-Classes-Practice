package Searching;

public class FindMinSortedArray2 {
    public static void main(String[] args) {
        int[] arr ={2,2,2,0,1};
        System.out.println(findMin(arr));

    }
    static int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[end]) {
                end = mid;
            } else if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                // nums[mid] == nums[end], can't decide, shrink the range
                end--;
            }
        }

        return nums[start];
    }

}
