package Basic_Questions;

public class CheckDup {
    public static void main(String[] args) {
        int num = 23422452;
        int target = 2;
        //System.out.println(findD(num, target));
        System.out.println(convertDEStoOc(88,8));
    }
    static int findD(int n,int target){
        int count=0; ;
        if(n<=0){
            return 1;
        }
        int temp;
        while(n!=0){
            temp=n%10;
           if(temp==target){
               count++;
           }
           n/=10;
        }
        return count;
    }
    static int convertDEStoOc(int num, int b){
        int rv = 0;
        int p = 1;
        while(num>0){
             int dig = num%b;
             num/=b;
             rv+=dig*p;
             p*=10;
        }
        return rv;
    }
}
