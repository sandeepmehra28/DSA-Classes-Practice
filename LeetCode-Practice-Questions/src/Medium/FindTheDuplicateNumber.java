package Medium;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] arr={3,1,3,4,2};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] arr) {
        int i =0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                int c = arr[i]-1;
                if(arr[i]!=arr[c]){
                    swap(arr,i,c);
                }else{
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] arr, int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}
