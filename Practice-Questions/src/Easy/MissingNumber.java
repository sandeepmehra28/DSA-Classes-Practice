package Easy;

public class MissingNumber {
    public static void main(String[] args) {
     int[] arr ={3,0,1};
        System.out.println(findMiss(arr));
    }
    static int findMiss(int[] arr){
        int i=0;
        while(i< arr.length){
            int c =arr[i];
            if(arr[i]< arr.length&&arr[i]!=arr[c]){
                swap(arr,i,c);
            }
            i++;
        }
        for(int j =0;j< arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int i, int c){
        int temp=arr[i];
        arr[i]=arr[c];
        arr[c]=temp;
    }
}
