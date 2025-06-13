package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Create_Target_Array_Given_Order {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};
        System.out.println(Arrays.toString(createTarget(arr,index)));
    }
    static int[] createTarget(int[] arr, int[] index){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(index[i],arr[i]);
        }
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = list.get(i);
        }
        return temp;
    }
}
