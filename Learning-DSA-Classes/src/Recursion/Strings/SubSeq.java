package Recursion.Strings;
public class SubSeq {
    public static void main(String[] args) {
       subseq("","abc");
    }
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }
    // second approach
    static void subseq2(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        subseq(p+up.charAt(0),up.substring(1));
        subseq(p,up.substring(1));
    }
}


//  * = take it , # ignore it
//                      ("", "abc")
//                 / *                \ #
//              ("a","bc")          ("","bc")
//              /*       \#            /*      \#
//         ("ab","c") ("a","c")   ("b","c")   ("","c")
//          /*   \#     /*  \#      /*   \#    /*  \#
//       ("abc","")   ("ab","")    ("c","")   ("","")