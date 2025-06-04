package StackP;

import java.util.Stack;

public class Sliding_Window_Maximum {
    public static void main(String[] args) {
        int[] arr = {2,9,3,8,1,7,12,6,14,4,32,0,7,19,8,12,6};
        int windowSize = 4;
        Stack<Integer> st = new Stack<>();
        int[] temp = new int[arr.length];
        st.push(arr.length- 1);
        temp[arr.length - 1] = arr.length;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
                st.pop();
            }
            temp[i]=st.isEmpty()?arr.length:st.peek();
            st.push(i);
        }
        int j =0;
        for (int i = 0; i <= arr.length-windowSize; i++) {
            if(j<i){
                j=i;
            }
            while (temp[j] < i + windowSize) {
                j = temp[j];
            }
            System.out.print(arr[j]+" ");
        }
    }
}
