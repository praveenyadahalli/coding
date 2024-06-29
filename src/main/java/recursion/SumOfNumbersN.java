package recursion;

public class SumOfNumbersN {
    public static void main(String[] args) {
        System.out.println(recursiveSum(10,0));
    }

    static int recursiveSum(int n,int sum){
        if(n==0){
            return sum;
        }
        sum+=n;
        return recursiveSum(n-1,sum);
    }
}
