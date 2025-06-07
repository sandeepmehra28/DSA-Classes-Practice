package Stack;

import java.util.Stack;

public class Postfix_converstion {
    public static void main() {
        String op ="ab*c+";
        Stack<Integer> vs = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> postfix = new Stack<>();
       for(int i = 0;i<op.length();i++){
           char ch = op.charAt(i);
           if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
               int v2 = vs.pop();
               int v1 = vs.pop();
               int val = operation(v1,v2,ch);
               vs.push(val);

               String iv2 = infix.pop();
               String iv1 = infix.pop();
               String ival = "(" + iv1+ch+iv2+")";
               infix.push(ival);

               String pv2 = postfix.pop();
               String pv1 = postfix.pop();
               String pval = ch+pv1+pv2;
               postfix.push(pval);

           }else{
               vs.push(ch-'0');
               infix.push(ch +"");
               postfix.push(ch+" ");
           }
       }
        System.out.println(vs.pop());
        System.out.println(infix.pop());
        System.out.println(postfix.pop());
    }
    static int operation(int v1, int v2, char ch){
        if(ch=='+'){
            return v1+v2;
        } else if (ch=='-') {
            return v1-v2;
        } else if (ch=='*') {
            return v1*v2;
        }else{
            return v1/v2;
        }
    }
}
