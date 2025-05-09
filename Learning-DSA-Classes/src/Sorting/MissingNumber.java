package Sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr= {9,6,4,2,3,5,7,0,1};
        System.out.println(mn(arr));
    }

    static void swap(int[] arr,int first, int sec){
        int temp =arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;
    }
    static  int mn(int[] arr){
        int i =0;
        while(i<arr.length){
            int c =arr[i];
            if(arr[i]<arr.length&&arr[i]!=arr[c]){
                swap(arr,i,c);
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j){
                return j;
            }
        }
       return arr.length;
    }
}