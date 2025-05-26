package Medium;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,5,6,4};
        System.out.println(findPeak(arr));
    }

    //they give array out of bound exception rare cases
    static int findPeak(int[] arr){
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return arr[start];
    }

    //but this code is perfect
    static int peakFind(int[] arr){
        int start =0;
        int end= arr.length-1;
        while(start<end){
            int mid =start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
