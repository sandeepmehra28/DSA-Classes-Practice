package Stack;

public class ValidParenthesisString {
    public static void main(String[] args) {
        String str= "(*))";
        System.out.println(find(str));
    }
    static boolean find(String str){
        int low = 0;int high = 0;
        for(char ch:str.toCharArray()){
            if(ch=='('){
                low++;
                high++;
            } else if (ch==')') {
                low--;
                high--;
            } else if (ch=='*') {
                low--;
                high++;
            }
            if(high<0)return false;
            if(low<0)low=0;
        }
        return low==0;
    }
}
