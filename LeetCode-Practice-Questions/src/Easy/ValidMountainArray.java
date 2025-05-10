package Easy;

public class ValidMountainArray {
    public static void main(String[] args) {
        int[] arr ={0,3,2,1};
        boolean ans =checkMountian(arr);
        System.out.println(ans);
    }
    static boolean checkMountian(int[] arr){
        int index =0;
        int n = arr.length;
        while (index<n-1){
            if(arr[index]<arr[index+1]){
                index++;
            }else{
                break;
            }
        }
        if(index==0||index==n-1){
            return false;
        }
        while (index<n-1){
            if(arr[index]>arr[index+1]){
                index++;
            }else{
                break;
            }
        }
        return (index==n-1);
    }
}
