package Medium;

public class MaximumCandiesAllocatedToKChildren {
    public static void main(String[] args) {
int[] candies={5,8,6};
int k = 3;
        System.out.println(maximumCandies(candies,k));
    }
    static int maximumCandies(int[] candies, long k) {
        int low = 1;
        int high = (int)1e7; // max candy in any pile
        int res = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canDistribute(candies, k, mid)) {
                res = mid;
                low = mid + 1; // try to maximize
            } else {
                high = mid - 1; // try smaller value
            }
        }

        return res;

    }

    static boolean canDistribute(int[] candies, long k, int target){
        long count = 0;

        for (int candy : candies) {
            count += candy / target;
        }

        return count >= k;
    }
}
