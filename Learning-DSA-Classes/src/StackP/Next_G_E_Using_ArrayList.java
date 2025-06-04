package StackP;

import java.util.ArrayList;
import java.util.Stack;

public class Next_G_E_Using_ArrayList {
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        System.out.println(findNG(arr));

    }
    static ArrayList<Integer> findNG(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] temp = new int[arr.length];
        st.push(arr[arr.length-1]);
        temp[arr.length-1]=-1;
        for(int i = arr.length-2;i>=0;i--){
            while(!st.isEmpty()&&arr[i]>=st.peek()){
                st.pop();
            }
            temp[i] = st.isEmpty()?-1:st.peek();
            st.push(arr[i]);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i : temp){
            result.add(i);
        }
        return result;
    }

}
