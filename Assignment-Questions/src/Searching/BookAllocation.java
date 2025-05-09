package Searching;

public class BookAllocation {
    public static void main(String[] args) {
        int[] books ={12, 34, 67, 90};
        int students  =2;
        System.out.println(bookAll(books,students));
    }
    static int bookAll(int[] books, int std){
        int start=Integer.MIN_VALUE;
        int end=0;
        for (int i = 0; i < books.length; i++) {
            if(books[i]>start){
                start=books[i];
            }
            end+=books[i];
        }
        int ans=-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(isP(books,mid,std)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return ans;
    }
    static boolean isP(int[] arr, int mid, int std){
        int current =1;
        int po =0;
        for(int i =0;i<arr.length;i++){
            po+=arr[i];
            if(po>mid){
                current++;
                po=arr[i];
            }if(current>std){
                return false;
            }
        }
        return true;
    }
}
