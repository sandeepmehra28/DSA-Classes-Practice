package Recursion.Strings;

public class Stream {
    public static void main(String[] args) {
            skip("baccabh","");
        System.out.println(skip("nachhhaabh"));
    }
    static void skip(String up, String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            skip(up.substring(1),p);
        }else {
            skip(up.substring(1),p+ch);
        }
    }
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch=='a'){
           return skip(up.substring(1));
        }else {
           return ch+ skip(up.substring(1));
        }
    }
}
