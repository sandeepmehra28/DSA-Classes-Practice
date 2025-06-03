package StackP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element_On_Right {
    public static void main(String[] args) {
        int[] arr = {2,5,9,3,1,12,6,8,7};
        ArrayList<Integer> ans = nextLargerElement(arr);
        System.out.println(ans);
    }
//    static int[] nextLargerElement(int[] arr){
//        //create array
//        int[] tempA = new int[arr.length];
//        //create stack
//        Stack<Integer> st = new Stack<>();
//        //push last element in the stack because we start the loop in dec order
//        st.push(arr[arr.length-1]);
//        tempA[arr.length-1]=-1;
//        for(int i = arr.length-2;i>=0;i--){
//            while(st.isEmpty() &&arr[i]>=st.peek()){
//                st.pop();
//            }
//            if(st.isEmpty()){
//                tempA[i]=-1;
//            }else{
//                tempA[i]=st.peek();
//            }
//            st.push(arr[i]);
//        }
//        return tempA;
//    }
public static ArrayList<Integer> nextLargerElement(int[] arr) {
    ArrayList<Integer> temp = new ArrayList<>();
    Stack<Integer> st = new Stack<>();
    st.push(arr[arr.length-1]);
    temp.addLast(-1);
    for(int i = arr.length-2;i>=0;i--){
        while(st.isEmpty()&&arr[i]>=st.peek()){
            st.pop();
        }
        if(st.isEmpty()){
            temp.add(-1);
        }else{
            temp.add(st.peek());
        }
        st.push(arr[i]);
    }
    return temp;
}
}
