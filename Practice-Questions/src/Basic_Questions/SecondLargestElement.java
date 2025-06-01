package Basic_Questions;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        System.out.println(findSecondLarge2(arr));
    }
    static int findSecondLarge(int[] arr){
        Arrays.sort(arr);
        for (int i = arr.length-2; i >=0; i--) {
            if(arr[i]!=arr[arr.length-1]){
                return arr[i];
            }
        }
        return -1;
    }
    static int findSecondLarge2(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n-2];
    }

    static int findThirdLarge(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n-3];
    }
}
