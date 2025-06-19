package W3resoursePractice;

public class Array_contains_specific_value {
    public static void main(String[] args) {
     int[] arr ={1789, 2035, 1899, 1456, 2013,
          1458, 2458, 1254, 1472, 2365,
          1456, 2265, 1457, 2456};
     int target = 1472;
        System.out.println(thisCountain(arr,target));
    }
    static boolean thisCountain(int[] arr, int target){
        for(int i:arr){
            if(i==target) {
                return true;
            }
        }
        return false;
    }
}
