package Sorting;

public class firstMissingPositive {
    public static void main(String[] args) {

    }
    public int firstMissingPositive(int[] arr) {
        int i =0;
        while(i<arr.length){
            int c =arr[i]-1;
            if(arr[i]>0&&arr[i]<=arr.length&&arr[i]!=arr[c]){
                swap(arr,i,c);
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return arr.length+1;
    }

    static void swap(int[] arr,int first, int sec){
        int temp =arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;
    }
}