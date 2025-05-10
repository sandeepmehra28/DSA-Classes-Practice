package Easy;

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] arr ={-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }
    static int largestAltitude(int[] gain) {
        int maxA =0;
        int curA=0;
        for(int i=0;i<gain.length;i++){
            curA+=gain[i];
            maxA = Math.max(maxA, curA);
        }
        return maxA;
    }
}
