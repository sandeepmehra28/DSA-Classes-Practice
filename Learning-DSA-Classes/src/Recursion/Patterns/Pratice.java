package Recursion.Patterns;

import java.util.Arrays;

public class Pratice {
    public static void main(String[] args) {
//        calls2(1);
        int[] arr ={4,3,2,5,6,1};
       // bubbleSort(arr,arr.length-1,0);
        selectSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void   calls(int n){
        if(n<1){
            return;
        }
        System.out.println(n);calls(--n);
    }
    static int calls2(int n){
        if(n==10){
            return n;
        }
        System.out.println(n);
        return calls2(n+1);
    }
    static void bubbleSort(int[] arr, int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubbleSort(arr,r,c+1);
        }else{
            bubbleSort(arr,r-1,0);
        }
    }
    static void selectSort(int[] arr, int r, int c, int m){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[m]){
                selectSort(arr,r,c+1,c);
            }else{
                selectSort(arr,r,c+1,m);
            }
        }else{
            int temp =arr[m];
            arr[m]=arr[r-1];
            arr[r-1]=temp;
            selectSort(arr,r-1,0,0);
        }
    }
}
