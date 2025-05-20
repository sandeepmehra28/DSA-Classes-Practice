package Easy;

public class CheckIfArrayIsSortedArrayAndRotated {
    public static void main(String[] args) {
        int[] arr ={3,4,5,1,2};
        System.out.println(check(arr));
    }
    static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Count where the next number is smaller than the current
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            if (count > 1) return false; // More than one drop => not a rotated sorted array
        }

        return true;
    }
}
