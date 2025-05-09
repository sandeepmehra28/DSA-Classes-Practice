package Sorting;

public class findDuplicatesCycleSort {
    public static void main(String[] args) {
     int[] arr ={1,3,4,2,2};
        System.out.println(findD(arr));
    }
    static int findD(int[] arr){
       int i= 0;
        while(i< arr.length){
            if(arr[i]!=i+1){
                    int c =arr[i]-1;
                    if(arr[i]!=arr[c]){
                        swap(arr,i,c);
                    }else {
                        return arr[i];
                    }
                }else{
                    i++;
                }
        }
        return -1;
    }
    static void swap(int[] arr, int start, int end){
        int temp =arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}