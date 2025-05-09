package Sorting;

public class checkDuplicatesWithinK {
    public static void main(String[] args) {
        // value 1, 2, 3, 1, 4, 5 = true
        // value 1, 2, 3, 4, 1, 2, 3, 4 = false
        int [] arr ={1, 2, 3, 4, 1, 2, 3, 4};
        int distance =3;
      if(checkDuplicatesWithinK(arr,distance)){
          System.out.println("true");
      }else{
          System.out.println("false");
      }


    }
    public  static  boolean checkDuplicatesWithinK(int[] arr, int distance) {
        // your code
        int n = arr.length;

        // Traverse for every element
        for (int i = 0; i < n; i++) {

            // Traverse next k elements
            for (int c = 1; c <= distance && (i + c) < n; c++) {
                int j = i + c;

                // If we find one more occurrence within k
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }
}