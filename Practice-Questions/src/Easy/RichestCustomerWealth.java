package Easy;

public class RichestCustomerWealth {
    public static void main(String[] args) {
      int[][] arr ={{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts) {
        int maxW =0;
        for(int i =0;i<accounts.length;i++){
            int c =0;
            for(int j =0;j<accounts[i].length;j++){
                c+=accounts[i][j];
            }
            if(c>maxW){
                maxW=c;
            }
        }
        return maxW;
    }
}
