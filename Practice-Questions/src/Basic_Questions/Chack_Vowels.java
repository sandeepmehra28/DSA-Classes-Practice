package Basic_Questions;

public class Chack_Vowels {
    public static void main(String[] args) {
        String s = "sandeep mehra";
        System.out.println(countV(s));
    }
    static int countV(String s){
        int count =0;
        for(int i =0;i<s.length();i++){
            if(isV(s.charAt(i))){
                count++;
            }
        }
        return count;
    }
    static boolean isV(char c){
        c  = Character.toUpperCase(c);
        return (c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
    }
}
