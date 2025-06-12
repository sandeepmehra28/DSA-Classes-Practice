package Stack;

import java.util.Stack;

public class Minimum_Add_make_parentheses_valid {
    public static void main(String[] args) {
        String str= "((()";
        System.out.println(makeV(str));
    }
    static int makeV(String str){
        int open =0, close = 0;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='('){
                open++;
            }else{
                if(open<=0){
                    close--;
                }else{
                    open--;
                }
            }
        }
        return open+close;
    }
}
