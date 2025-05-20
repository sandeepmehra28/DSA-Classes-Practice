package Hard;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,3,1};
        int target =3;
        System.out.println(findIndex(arr,target));
    }
    static int findIndex(int[] arr,int target){
        int n=arr.length;
        int peak =findPeak(arr);
        int result = findIndex(arr,target,0,peak,true);
        if(result!=-1){
            return result;
        }
        return findIndex(arr,target,peak+1,n-1,false);
    }
    static int findPeak(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }
    static int findIndex(int[] arr,int target,int start, int end,boolean isA){
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isA){
                if(target<arr[mid]){
                   start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(target<arr[mid]){
                   end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
