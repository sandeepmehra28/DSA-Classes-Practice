package Easy;

public class Find_Numbers_with_Even_Number_Digits {
    public static void main(String[] args) {
      int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
    static public int findNumbers(int[] nums) {
        int count =0;int temp;
        for(int i = 0;i<nums.length;i++){
            temp = nums[i];
             if(even(temp)){
                 count++;
             }
        }
        return count;
    }
    static boolean even(int n){
        int digits = 0;
        while(n>0){
            n/=10;
            digits++;
        }
        return digits%2==0;
    }
}
//Example 1:
//
//Input: nums = [12,345,2,6,7896]
//Output: 2
//Explanation:
//12 contains 2 digits (even number of digits).
//345 contains 3 digits (odd number of digits).
//2 contains 1 digit (odd number of digits).
//6 contains 1 digit (odd number of digits).
//7896 contains 4 digits (even number of digits).
//Therefore only 12 and 7896 contain an even number of digits.

//Example 2:
//
//Input: nums = [555,901,482,1771]
//Output: 1
//Explanation:
//Only 1771 contains an even number of digits.