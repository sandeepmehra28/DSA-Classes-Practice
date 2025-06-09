package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Remove_Consecutive_Subsequences {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        System.out.println(Arrays.toString(rem(arr)));
    }
    static int[] rem(int[] arr){
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<arr.length;i++){
            if(st.isEmpty() || st.peek()!=arr[i]){
                st.push(arr[i]);
            }
            else if(st.peek()==arr[i]){
                if(i==arr.length-1 ||arr[i] != arr[i+1]){
                    st.pop();
                }
            }
        }
        int[] re = new int[st.size()];
        for(int i = re.length-1;i>=0;i--){
            re[i] = st.pop();
        }
        return re;
    }
}
