package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Next_G_E_using_list {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //1, 3, -1, -3, 5, 3, 6, 7
        list.add(1);
        list.add(3);
        list.add(-1);
        list.add(-3);
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(7);
       int winSize = 3;
        System.out.println(slidingMaximum(list,winSize));
    }
    public static ArrayList<Integer> slidingMaximum(final List<Integer> arr, int k) {
        Stack<Integer> st = new Stack<>();
        int[] temp = new int[arr.size()];
        st.push(arr.size()-1);
        temp[arr.size()-1]=arr.size();
        for(int i = arr.size()-2;i>=0;i--){
            while(!st.isEmpty()&&arr.get(i)>=arr.get(st.peek())){
                st.pop();
            }
            temp[i] = st.isEmpty()?arr.size():st.peek();
            st.push(i);
        }
        ArrayList<Integer> result = new ArrayList<>();
        int j = 0;
        for(int i = 0;i<=arr.size()-k;i++){
            if(j<i){
                j=i;
            }
            while(temp[j]<i+k){
                j = temp[j];
            }
            result.add(arr.get(j));
        }
        return result;
    }
}
