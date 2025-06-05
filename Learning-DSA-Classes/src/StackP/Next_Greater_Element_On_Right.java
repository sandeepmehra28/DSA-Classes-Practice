package StackP;


import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element_On_Right {
    public static void main(String[] args) {
        int[] arr = {7 ,12 ,1 ,20};
        System.out.println(Arrays.toString(nextLargerElement(arr)));
    }
    static int[] nextLargerElement(int[] arr){
        //create array
        int[] temp = new int[arr.length];
        //create stack
        Stack<Integer> st = new Stack<>();
        //push last element in the stack because we start the loop in dec order
        st.push(arr[arr.length-1]);
        temp[arr.length-1]=-1;
        for(int i = arr.length-2;i>=0;i--){
            while(!st.isEmpty() &&arr[i]>=st.peek()){
                st.pop();
            }
            temp[i]=st.isEmpty()?-1:st.peek();
            st.push(arr[i]);
        }
        return temp;
    }

}
