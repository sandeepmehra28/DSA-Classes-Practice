package StackP;

import java.util.Arrays;
import java.util.Stack;

public class Stock_Span_Array {
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        System.out.println(Arrays.toString(stock(arr)));
    }
    static int[] stock(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] temp =new int[arr.length];
        st.push(0);
        temp[0]=1;
        for (int i = 1; i <arr.length; i++) {
            while(st.size()>0&&arr[i]>arr[st.peek()]){
                st.pop();
            }
            temp[i] = st.isEmpty()?i+1:i-st.peek();
            st.push(i);
        }
        return temp;
    }
}
