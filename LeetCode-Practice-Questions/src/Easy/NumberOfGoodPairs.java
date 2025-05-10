package Easy;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,3};
        System.out.println(pairs(arr));
    }
    static int pairs(int[] arr){
        int pair=0;
        int i=0;
        while(i<arr.length){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]&&i<j){
                    pair+=1;
                }
            }
            i++;
        }
        return pair;
    }
}
