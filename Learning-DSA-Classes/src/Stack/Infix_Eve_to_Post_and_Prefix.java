package Stack;

import java.util.Stack;

public class Infix_Eve_to_Post_and_Prefix {
    public static void main(String... args) {
        String str = "2+6*4/8-3";
        Stack<String> postfix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<Character> opr = new Stack<>();
        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='('){
             opr.push(ch);
            } else if ((ch>='0'&&ch<='9')||(ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
                postfix.push(ch+"");
                prefix.push(ch+"");
            } else if (ch==')') {
                while(opr.peek()!='('){
                  char op = opr.pop();
                  String postv2 = postfix.pop();
                  String postv1 = postfix.pop();
                  String posto = postv1+postv2+op;
                  postfix.push(posto);

                    String prev2 = prefix.pop();
                    String prev1 = prefix.pop();
                    String preo = op+prev1+prev2;
                    prefix.push(preo);
                }
                opr.pop();
            } else if (ch=='+'||ch=='-'||ch=='*'||ch=='/') {
                while(opr.size()>0 &&  opr.peek()!='(' && pre(ch)<=pre(opr.peek())){
                    char c = opr.pop();
                    String postv2 = postfix.pop();
                    String postv1 = postfix.pop();
                    String posto = postv1 +postv2+c;
                    postfix.push(posto);

                    String prev2 = prefix.pop();
                    String prev1 = prefix.pop();
                    String preo = c+prev1+prev2;
                    prefix.push(preo);
                }
                opr.push(ch);
            }
        }
        while(!opr.isEmpty()){
            char o = opr.pop();
            String v2 = postfix.pop();
            String v1 = postfix.pop();
            String posto = v1+v2+o;
            postfix.push(posto);

            String prev2 = prefix.pop();
            String prev1 = prefix.pop();
            String preo = o+prev1+prev2;
            prefix.push(preo);
        }
        System.out.println(prefix.peek()+" this is prefix convertion");
        System.out.println(postfix.peek()+" this is postfix converstion");
    }
    static int pre(char ch){
        if(ch=='+'||ch=='-')return 1;
        if(ch=='*'||ch=='/')return 2;
        return 0;
    }
}
