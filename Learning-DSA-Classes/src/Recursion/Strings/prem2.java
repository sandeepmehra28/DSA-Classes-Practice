package Recursion.Strings;

import java.util.HashSet;

public class prem2 {
    public static void main(String[] args) {
      String s1 ="abc";
      String s2 ="lecabee";
        System.out.println(helper("","abc"));
    }
    public static boolean checkInclusion(String s1, String s2) {
        HashSet<String> uniquePrem = helper("",s2);
        if(s1.equals(uniquePrem)){
            return true;
        }else{
            return false;
        }//
    }
    static HashSet<String> helper(String p, String up){
        HashSet<String> result = new HashSet<>();
        if(up.length()==0){
            result.add(p);
            return result;
        }
        for (int i = 0; i < up.length(); i++) {
            char ch = up.charAt(i);
            String l =up.substring(0,i);
            String r =up.substring(i+1);
            String finalAns = l+r;
            result.addAll(helper(p+ch,finalAns));
        }
        return result;
    }
}
