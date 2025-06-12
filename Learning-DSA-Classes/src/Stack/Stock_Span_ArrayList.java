package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Stock_Span_ArrayList {
    public static void main(String[] args) {
        int[] arr = {100 ,80 ,60 ,70 ,60 ,75 ,85};
        System.out.println(stock(arr));
    }
    static ArrayList<Integer> stock(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] temp = new int[arr.length];
        st.push(0);
        temp[0]=1;
        for(int i = 1;i<arr.length;i++){
            while (st.size()>0&&arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                temp[i] = i+1;
            }else {
                temp[i]=i-st.peek();
            }
            st.push(i);
        }
        ArrayList<Integer> re = new ArrayList<>();
        for(int i:temp){
            re.add(i);
        }
        return re;
    }
}
