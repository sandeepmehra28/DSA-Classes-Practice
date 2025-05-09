package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort_Odd_Even_Ways {
    public static void main(String[] args) {

    }
    public static int oddEvenSort(int n, int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        // Check if we can get from arr to sorted while preserving odd/even order
        List<Integer> originalOdds = new ArrayList<>();
        List<Integer> originalEvens = new ArrayList<>();
        List<Integer> sortedOdds = new ArrayList<>();
        List<Integer> sortedEvens = new ArrayList<>();

        for (int val : arr) {
            if (val % 2 == 0) {
                originalEvens.add(val);
            } else {
                originalOdds.add(val);
            }
        }

        for (int val : sorted) {
            if (val % 2 == 0) {
                sortedEvens.add(val);
            } else {
                sortedOdds.add(val);
            }
        }

        // If the sequence of odds and evens match, sorting is possible
        return (originalEvens.equals(sortedEvens) && originalOdds.equals(sortedOdds)) ? 1 : 0;
    }
}