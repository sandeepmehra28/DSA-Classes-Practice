package Medium;

public class SearchInRotatedSortedArray2 {
    public static void main(String[] args) {
        int[] arr ={2,5,6,0,0,1,2};
        int target =0;
        System.out.println(search(arr,target));
        System.out.println(searchNUM(arr,target));
    }
    static boolean search(int[] arr, int target){
       int start =0;
       int end=arr.length-1;
       while(start<=end){
           int mid= start+(end-start)/2;
           if(target==arr[mid]){
               return true;
           }
           if(arr[start]==arr[mid]&&arr[mid]==arr[end]){
               start++;
               end--;
           } else if (arr[start]<=arr[mid]) {
               if(target>=arr[start]&&target<arr[mid]){
                   end=mid-1;
               }else{
                   start=mid+1;
               }
           }else{
               if(target>arr[mid]&&target<=arr[end]){
                   start=mid+1;
               }else{
                   end=mid-1;
               }
           }
       }
       return false;
    }
    static int searchNUM(int[] arr, int target){
        int start =0;
        int end=arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(arr[start]==arr[mid]&&arr[mid]==arr[end]){
                start++;
                end--;
            } else if (arr[start]<=arr[mid]) {
                if(target>=arr[start]&&target<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>arr[mid]&&target<=arr[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
