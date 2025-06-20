package Arrays;

public class searchInsertK {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int po = 2;
        System.out.println(insP(arr,po));
    }
    static int insP(int[] arr, int k){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>=k){
            return i;
            }
        }
        return arr.length;
    }
}
