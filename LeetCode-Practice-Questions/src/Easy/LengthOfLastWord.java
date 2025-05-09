package Easy;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String name="sandeep mehra";
        System.out.println(lengthOfLastWord(name));
    }
    static int lengthOfLastWord(String s) {
        int length =0;
        int i = s.length()-1;
        while(i>=0&&s.charAt(i)==' '){
            i-=1;
        }while(i>=0&&s.charAt(i)!=' '){
            length+=1;
            i-=1;
        }
        return length;
    }
}
