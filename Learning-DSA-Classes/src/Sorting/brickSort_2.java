package Sorting;

import java.util.Arrays;

public class brickSort_2 {
    public static void main(String[] args) {
        int[] arr ={7,7,6,5,4,3,9,9,0,0,1};
        oddEvenSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void oddEvenSort(int[] arr){
        boolean isSorted = false; // Initially array is unsorted
         int n =arr.length;
        while (!isSorted)
        {
            isSorted = true;
            int temp =0;

            // Perform Bubble sort on odd indexed element
            for (int i=1; i<=n-2; i=i+2)
            {
                if (arr[i] > arr[i+1])
                {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    isSorted = false;
                }
            }

            // Perform Bubble sort on even indexed element
            for (int i=0; i<=n-2; i=i+2)
            {
                if (arr[i] > arr[i+1])
                {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    isSorted = false;
                }
            }
        }

        return;
    }
}