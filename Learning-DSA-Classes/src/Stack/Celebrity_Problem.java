package Stack;

import java.util.Stack;

public class Celebrity_Problem {
    public static void main(String[] args) {
     int[][] mat={{1, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        System.out.println(celebrity(mat));
    }
     static int celebrity(int arr[][]) {
         Stack<Integer> st = new Stack<>();
         for(int i =0;i<arr.length;i++){
             st.push(i);
         }
        while(st.size()>=2){
            int i = st.pop();
            int j = st.pop();
            if(arr[i][j]==1){
                //if i knows j : i is not a celebrity
                st.push(j);
            }else{
                st.push(i);
            }
        }
        int po  = st.pop();
        for(int i = 0;i<arr.length;i++){
            if(i!=po){
                if(arr[i][po]==0 || arr[po][i]==1){
                    return -1;
                }
            }
        }
       return po;
    }
}
