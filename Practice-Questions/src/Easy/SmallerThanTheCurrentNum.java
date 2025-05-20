package Easy;

import java.util.Arrays;

public class SmallerThanTheCurrentNum {
    public static void main(String[] args) {
        int[] arr ={8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int n =nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int c =0;
            for(int j=0;j<n;j++){
                if(nums[j]<nums[i]){
                    c++;
                }

            }
            arr[i]=c;
        }
        return arr;
    }
}
