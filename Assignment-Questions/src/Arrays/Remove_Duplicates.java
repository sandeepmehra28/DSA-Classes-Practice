package Arrays;

import java.util.Arrays;

public class Remove_Duplicates {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2};
        System.out.println(findD(arr));
    }
    static int findD(int[] arr){
        int count=0;
        for(int i = 0 ;i<arr.length;i++){
            if(i<arr.length-1&& arr[i] == arr[i+1]){
                continue;
            }
            arr[count] = arr[i];
            count++;
        }
        return count;
    }
}
