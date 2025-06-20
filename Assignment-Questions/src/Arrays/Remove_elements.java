package Arrays;

public class Remove_elements {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int e = 2;
        System.out.println(removeEL(arr,e));
    }
    static int removeEL(int[] arr, int e){
        int count=0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != e){
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }
 }
