package Exam_Prep;

import java.util.ArrayList;
import java.util.LinkedList;

public class InhanceForLoop {
    static void main() {
        ArrayList<String> al = new ArrayList<>();
        al.add("apple");
        al.add("banana");
        al.add("orange");
        for(String f : al){
            System.out.println(f);
        }

        int[] arr = {1,2,3,4,5};
        for(int i: arr){
            System.out.println(i);
        }
    }
}
