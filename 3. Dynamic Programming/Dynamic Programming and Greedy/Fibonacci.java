import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        // int fibn = fib(n);
        int fibn = fibMemoized(n, new int[n + 1]);
        System.out.println(fibn);
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        System.out.println("Hello" + n);
        int fibnm1 = fib(n - 1);
        int fibnm2 = fib(n - 2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }

    public static int fibMemoized(int n, int[] qb) {
        if(n == 0 || n == 1){
            return n;
        }

        if (qb[n] != 0) {
            return qb[n];
        }

        System.out.println("Hello" + n);
        int fibnm1 = fibMemoized(n - 1, qb);
        int fibnm2 = fibMemoized(n - 2, qb);
        int fibn = fibnm1 + fibnm2;
        qb[n] = fibn;
        return fibn;
    }
}