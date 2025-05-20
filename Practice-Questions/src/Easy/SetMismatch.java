package Easy;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        System.out.println(Arrays.toString(arr));
    }
    static int[] findErrorNums(int[] arr) {
        int i= 0;
        while(i<arr.length){
            int c =arr[i]-1;
            if(arr[i]!=arr[c]){
                swap(arr,i,c);
            }else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                return new int[]{arr[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[] arr, int i, int c){
        int temp= arr[i];
        arr[i]=arr[c];
        arr[c]=temp;
    }
}
