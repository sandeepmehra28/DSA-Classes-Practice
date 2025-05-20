package Medium;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 30;
        System.out.println(searchMatrix(arr,target));
        System.out.println(Arrays.toString(searchMatrixInNum(arr,target)));
    }
    static boolean searchMatrix(int[][] matrix, int target) {
        int r = 0; int c = matrix[0].length-1;

        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
        {
            return false;
        }
        while(r<matrix.length && c>=0)
        {
            if(matrix[r][c]==target)
            {
                return true;
            }
            else if(matrix[r][c]<target)
            {
                r++;
            }
            else
            {
                c--;
            }
        }
        return false;
    }
    static int[] searchMatrixInNum(int[][] matrix, int target) {
        int r = 0; int c = matrix[0].length-1;

        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
        {
            return null;
        }
        while(r<matrix.length && c>=0)
        {
            if(matrix[r][c]==target)
            {
                return new int[]{r,c};
            }
            else if(matrix[r][c]<target)
            {
                r++;
            }
            else
            {
                c--;
            }
        }
        return null;
    }
}
