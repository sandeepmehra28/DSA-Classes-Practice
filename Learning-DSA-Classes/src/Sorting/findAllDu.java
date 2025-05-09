package Sorting;

import java.util.ArrayList;
import java.util.List;

public class findAllDu {
    public static void main(String[] args) {

    }
    public List<Integer> findDuplicates(int[] arr) {
      int i =0;
      while(i<arr.length){
          int c =arr[i]-1;
          if(arr[i]!=arr[c]){
              swap(arr,i,c);
          }else{
              i++;
          }

      }
        List<Integer> aa =new ArrayList<>();
      for(int j =0;j<arr.length;j++){
          if(arr[j]!=j){
              aa.add(arr[j]);
          }
      }
      return aa;
    }
    static void swap(int[] arr, int i, int c){
        int temp =arr[i];
        arr[i]=arr[c];
        arr[c]=temp;
    }
}