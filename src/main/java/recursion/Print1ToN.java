package recursion;

public class Print1ToN {
    public static void main(String[] args) {
        printNums(0,10);
        printNumsReverse(10);
    }
    public static void printNums(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        printNums(i+1,n);
    }

    public static void printNumsReverse(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumsReverse(n-1);
    }
}
