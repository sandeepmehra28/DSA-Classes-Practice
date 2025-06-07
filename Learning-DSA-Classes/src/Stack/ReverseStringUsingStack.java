package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String name = "sandeepmehra";
        System.out.println(name);
        System.out.println(reverse(name));
    }
    static String reverse(String s){
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray())
            st.push(ch);
            StringBuilder re=  new StringBuilder();
            while(!st.isEmpty()){
                re.append(st.pop());
            }
           return re.toString();
    }
}
