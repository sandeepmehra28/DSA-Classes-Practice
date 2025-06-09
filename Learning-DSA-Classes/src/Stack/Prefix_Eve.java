package Stack;

import java.util.Stack;

public class Prefix_Eve {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<Integer> st = new Stack<>();
        for(int i = str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                st.push(ch-'0');
            }else{
              int v1 = st.pop();
              int v2 = st.pop();
              if(ch=='+')st.push(v1+v2);
                if(ch=='-')st.push(v1-v2);
                if(ch=='/')st.push(v1/v2);
                if(ch=='*')st.push(v1*v2);
            }
        }
        System.out.println(st.peek());
    }
}
