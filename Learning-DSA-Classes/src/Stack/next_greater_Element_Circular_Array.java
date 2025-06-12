package Stack;

import java.util.Arrays;
import java.util.Stack;

public class next_greater_Element_Circular_Array {
    public static void main(String[] args) {
        int[] arr  = {1,2,1};
        int len = arr.length;
        System.out.println(Arrays.toString(findGE(arr,len)));
    }
    static int[] findGE(int[] arr, int n){
        Stack<Integer> st = new Stack<>();
        int[] temp = new int[arr.length];
        st.push(arr.length-1);
        temp[arr.length-1]=-1;
        for(int i = 2*n-2;i>=0;i--){
            while(!st.isEmpty() && arr[i%n]>=st.peek()){
                st.pop();
            }
            temp[i%n] = st.isEmpty()? -1:st.peek();
            st.push(arr[i%n]);
        }
        return temp;
    }
}
