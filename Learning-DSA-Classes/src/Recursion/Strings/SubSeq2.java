package Recursion.Strings;

import java.util.ArrayList;
import java.util.List;

public class SubSeq2 {
    public static void main(String[] args) {
        findSubSeq("","abc");
        System.out.println(AL);
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


}
