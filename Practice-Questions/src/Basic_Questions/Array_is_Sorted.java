package Basic_Questions;

public class Array_is_Sorted {
    public static void main(String[] args) {
        int[] arr = {22,33,99,55,66};
        System.out.println(isS(arr));
    }
    static boolean isS(int[] arr){
        if(arr.length==0||arr.length==1){
            return true;
        }
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
}
