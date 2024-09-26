import java.util.Scanner;

public class _007AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);

        scn.close();
    }

    public static int getProduct(int b, int n1, int n2) {
        int rv = 0;

        int p = 1;
        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 /= 10;

            int pwd = getProductWithd(b, n1, d2);
            rv = getSumOfEachProduct(b, rv, p * pwd);
            p *= 10;
        }

        return rv;
    }

    public static int getProductWithd(int b, int n1, int d2) {
        int rv = 0;

        int c = 0, p = 1;

        while (n1 > 0 || c > 0) {
            int d1 = n1 % 10;
            n1 /= 10;

            int d = c + d1 * d2;
            c = d / b;
            d %= b;

            rv += d * p;
            p *= 10;
        }

        return rv;
    }

    public static int getSumOfEachProduct(int b, int n1, int n2) {
        int rv = 0;

        int p = 1, c = 0;

        while (n1 > 0 || n2 > 0 || c > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;

            int d = d1 + d2 + c;
            c = d / b;
            d %= b;

            rv += d * p;
            p *= 10;
        }

        return rv;
    }
}
