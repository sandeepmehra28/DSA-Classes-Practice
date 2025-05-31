package Basic_Questions;

public class Maximum_Element_in_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                      { 25, 6, 7, 8},
                      { 9, 10, 11, 12},
                     {13, 14, 15, 16 }};
        System.out.println(maxEl(arr));
    }
    static int maxEl(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] i:arr){
            for(int j :i){
                if(j>max){
                    max=j;
                }
            }
        }
        return max;
    }
}
