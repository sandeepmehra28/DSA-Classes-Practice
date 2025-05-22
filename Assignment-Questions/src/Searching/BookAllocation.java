package Searching;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BookAllocation {
    public static void main(String[] args) {
//        int[] books ={22, 23, 67};
//        int students  =1;
//        System.out.println(bookAll(books,students));


        //codingNinjas
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(12);
        arr.add(34);
        arr.add(67);
        arr.add(90);
        int n = arr.size();
        int m =2;
        System.out.println(findAllocation(arr,n,m));
    }

    private static int findAllocation(ArrayList<Integer> arr,int n, int m) {
      int start =Integer.MIN_VALUE;
      int end=0;
      for(int i =0;i<arr.size();i++){
          if(arr.get(i)>start){
              start=arr.get(i);
          }
          end+=arr.get(i);
      }
      int ans=-1;
      while(start<=end){
          int mid= start+(end-start)/2;
          if(isA(arr,mid,m)){
              ans=mid;
              end=mid-1;
          }else{
              start=mid+1;
          }
      }
      return ans;
    }
    private static boolean isA(ArrayList<Integer> arr, int mid, int m){
        int cu =1;
        int po=0;
        for(int i =0;i<arr.size();i++){
            po+=arr.get(i);
            if(po>mid){
                cu++;
                po=arr.get(i);
            }if(cu>m){
                return false;
            }
        }
        return true;
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
