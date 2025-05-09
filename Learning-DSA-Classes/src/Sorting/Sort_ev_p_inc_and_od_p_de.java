package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_ev_p_inc_and_od_p_de {
    public static void main(String[] args) {
        int[] arr={0, 1, 2, 3, 4, 5, 6, 7};
        bitonicGenerator(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bitonicGenerator(int[] arr) {

        // create evenArr[] and oddArr[]
        List<Integer> evenArr = new ArrayList<>();
        List<Integer> oddArr = new ArrayList<>();

        // Put elements in oddArr[] and evenArr[] as
        // per their position
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                evenArr.add(arr[i]);
            else
                oddArr.add(arr[i]);
        }

        // sort evenArr[] in ascending order
        // sort oddArr[] in descending order
        Collections.sort(evenArr);
        Collections.sort(oddArr, Collections.reverseOrder());

        int i = 0;
        for (int num : evenArr)
            arr[i++] = num;
        for (int num : oddArr)
            arr[i++] = num;
    }
}