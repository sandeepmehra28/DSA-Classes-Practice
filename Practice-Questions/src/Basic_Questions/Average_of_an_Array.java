package Basic_Questions;

public class Average_of_an_Array {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 7, 5, 3};
        System.out.println(avg(arr));
    }
    static double avg(int[] arr){
       int num=0;
        for(int i =0;i<arr.length;i++){
            num+=arr[i];
        }
         return num/arr.length;
    }
}
