package W3resoursePractice;

import java.util.Arrays;

public class Remove_Specific_Element_Array {
    public static void main(String[] args) {
        int[] arr ={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int index = 3;
        System.out.println(Arrays.toString(removeI(arr,index)));
    }
    static int[] removeI(int[] arr, int index){
         for(int i = index;i<arr.length-1;i++){
             arr[i] = arr[i+1];
         }
        return arr;
    }
}
