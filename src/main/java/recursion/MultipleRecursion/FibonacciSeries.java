package recursion.MultipleRecursion;

public class FibonacciSeries {
    static int fibo(int n) {
        if (n <= 1) return n;
        int last = fibo(n - 1);
        int slast = fibo(n - 2);
        return last+slast;
    }

    public static void main(String[] args) {
        System.out.println(fibo(10));
    }
}
