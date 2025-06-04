package StackP;

import java.util.Arrays;
import java.util.Stack;

public class Sliding_window_Max_in_Array {
    public static void main(String[] args) {
        long[] arr= {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        System.out.println(Arrays.toString(maxOfSubarrays(arr,k)));
    }
    static long[] maxOfSubarrays(long[] arr, int k) {
        Stack<Integer> st = new Stack<>();
        int[] temp = new int[arr.length];
        st.push(arr.length-1);
        temp[arr.length-1] =arr.length;
        for(int i = arr.length-2;i>=0;i--){
            while(!st.isEmpty()&&arr[i]>=arr[st.peek()]){
                st.pop();
            }
            temp[i] = st.isEmpty()? arr.length : st.peek();
//            if(st.isEmpty()) {
//                temp[i] = arr.length;
//            }else{
//                temp[i]=st.peek();
//            }
            st.push(i);
        }
        long[] result = new long[arr.length - k + 1];
        int j=0;
        for(int i = 0;i<=arr.length-k;i++){
            if(j<i){
                j=i;
            }
            while(temp[j]<i+k){
                j = temp[j];
            }
            result[i] = arr[j];
        }
        return result;
    }
}
