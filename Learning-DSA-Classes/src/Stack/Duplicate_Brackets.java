package Stack;

import java.util.Stack;

public class Duplicate_Brackets {
    public static void main(String[] args) {
        String n1  = "((a+b)+(c+d))";
        String n2 = "(a+b)+((c+d))";
        String n3 = "(a+b+(c+d))";
        System.out.println(inD3(n1));
    }
    static boolean inD(String v){
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<v.length();i++){
            char ch = v.charAt(i);
            if(ch==')'){
                if(st.peek()=='('){
                    return true;
                }else{
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }
            }else {
                st.push(ch);
            }
        }
        return false;
    }
    static boolean inD2(String v){
        Stack<Character> st = new Stack<>();
       for(char ch:v.toCharArray()){
           if(ch==')'){
               if(st.peek()=='('){
                   return true;
               }else{
                   while(st.peek()!='('){
                       st.pop();
                   }
                   st.pop();
               }
           }else{
               st.push(ch);
           }
       }
       return false;
    }
    static boolean inD3 (String str){
        Stack<Character> st= new Stack<>();
        for(char ch:str.toCharArray()){
            if(ch=='(')st.push(ch);
            else if (ch==')') {
                if(st.isEmpty()){
                    return false;
                }
                char temp = st.pop();
                if(ch==')' && temp!='('){
                  return false;
                }
            }
        }
        return st.isEmpty();
    }
}
