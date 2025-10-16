package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
public class practice {
    public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<>();
    a.add(0,1);
        a.add(1,2);
        a.add(2,3);
        a.add(3,4);
        a.add(4,5);
        a.add(5,6);
        int m = 3;
        System.out.println(a);
        reverseArray(a,m);
        System.out.println(a);
    }
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int start = m+1;
        int end = arr.size()-1;
        while (start<=end){
        Collections.swap(arr,start,end);
        start++;
        end--;
    }

    }

}