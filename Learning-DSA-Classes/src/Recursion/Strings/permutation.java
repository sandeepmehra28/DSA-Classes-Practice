package Recursion.Strings;

import java.util.ArrayList;
import java.util.HashSet;

public class permutation {
    public static void main(String[] args) {
        permu("","ABC");
 //       findPermutation("ABSG");
//        ArrayList<String> permutations = findPermutation("aa");
//        System.out.println(permutations);
    }
    static void permu(String p,String up){
        if(up.length()==0){
            System.out.println(p);
            return;
        }
        for (int i = 0; i < up.length(); i++) {
        char ch = up.charAt(i);
        String left = up.substring(0,i);
        String right = up.substring(i+1);
        String finalAns =left+right;
        permu(p+ch,finalAns);
        }

    }
    public static ArrayList<String> findPermutation(String s) {
        HashSet<String> uniquePermutations = helperPrem("", s);
        return new ArrayList<>(uniquePermutations);
    }
    static  HashSet<String> helperPrem(String p, String up){
        HashSet<String> result = new HashSet<>();
        if(up.length()==0){
            result.add(p);
            return result;
        }
        for (int i = 0; i < up.length(); i++) {
            char ch =up.charAt(i);
            String left = up.substring(0,i);
            String right =up.substring(i+1);
            String finalAns =left+right;
            result.addAll(helperPrem(ch+p,finalAns));
        }

        return result;
    }
}
