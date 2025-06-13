package Arrays;

import java.util.Arrays;

public class How_ManyNumbers_Smaller_Than_Current_Number {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(findmini(arr)));
    }
    static int[] findmini(int[] arr){
        int count=0;
        int[] temp = new int[arr.length];
        for(int i = 0;i< arr.length;i++){
            //this loop run in every index
            for(int j = 0;j<arr.length;j++){
                if(i!=j){//skip the present index
                    if(arr[j]<arr[i]){//check the current index and all index is less than
                        // the current index if this condition is true count will be count + 1
                        count++;
                    }
                    //assign the total count in the temp array
                    temp[i] = count;
                }
            }
            //when they insert the count in the temp array , count will be zero for next element
            count=0;
        }
        //return array
        return temp;
    }
}
