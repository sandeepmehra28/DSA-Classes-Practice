package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEvenAndOddIndicesIndependently {
    public static void main(String[] args) {
     int[] nums ={4,1,2,3};
        System.out.println(Arrays.toString(sortEvenOdd(nums)));
    }
    static int[] sortEvenOdd(int[] arr) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        // Separate values based on index parity (not value parity)
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }

        // Sort even indices values in non-decreasing order
        Collections.sort(even);
        // Sort odd indices values in non-increasing order
        Collections.sort(odd, Collections.reverseOrder());

        int evenIndex = 0, oddIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = even.get(evenIndex++);
            } else {
                arr[i] = odd.get(oddIndex++);
            }
        }

        return arr;
    }
}
