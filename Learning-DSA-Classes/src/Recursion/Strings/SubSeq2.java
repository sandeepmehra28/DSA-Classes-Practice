package Recursion.Strings;

import java.util.ArrayList;
import java.util.List;

public class SubSeq2 {
    public static void main(String[] args) {
        findSubSeq("","abc");
        System.out.println(AL);
        System.out.println(findSeq2("","abc"));
        subseqAscii("", "abc");
    }

    static List<String> AL = new ArrayList<>();
    static void findSubSeq(String p, String up){
        if(up.isEmpty()){
            AL.add(p);
            return;
        }
        findSubSeq(p+up.charAt(0),up.substring(1));
        findSubSeq(p,up.substring(1));
    }

    static ArrayList<String> findSeq2(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> left = findSeq2(p+up.charAt(0),up.substring(1));
        ArrayList<String> right = findSeq2(p,up.substring(1));
        left.addAll(right);
        return left;
    }
    static void subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
//        char ch = up.charAt(0);
        subseqAscii(p + up.charAt(0), up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (up.charAt(0)+0), up.substring(1));
    }

}
