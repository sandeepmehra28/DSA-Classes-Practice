package Easy;

import java.util.HashSet;

public class ContiansDuplicate {
    public static void main(String[] args) {
        int[] arr ={1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) return true;
        }
        return false;
    }
}
