package Medium;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int[] arr ={7,6,3,3,6,7,8,5,3};
        System.out.println(Arrays.toString(sortArray(arr)));
    }
    static int[] sortArray(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i - 1;

            while (prev >= 0 && nums[prev] > curr) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            nums[prev + 1] = curr;
        }
        return nums;
    }
}
