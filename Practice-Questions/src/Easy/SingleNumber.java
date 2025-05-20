package Easy;

public class SingleNumber {
    public static void main(String[] args) {
  int[] arr={4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
    static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR cancels out duplicates
        }
        return result;
        // int start=0;
        // int end=nums.length-2;
        // while(start<=end){
        //     int mid =start+(end-start)/2;
        //     if(nums[mid]==nums[mid^1]){
        //         start = mid+1;
        //     }else{
        //         end=mid-1;
        //     }
        // }
        // return nums[start];
    }
}
