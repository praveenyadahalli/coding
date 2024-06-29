package recursion.backTrack;

public class Print1ToN {
    public static void main(String[] args) {
        printNums(5);
        printNumsReverse(5,1);
    }
    public static void printNums(int n){
        if(n==0){
            return;
        }
        printNums(n-1);
        System.out.println(n);
    }

    public static void printNumsReverse(int n,int k){
        if(k>n){
            return;
        }
        printNumsReverse(n,k+1);
        System.out.println(k);
    }
}
