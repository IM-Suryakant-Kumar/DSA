import java.util.Scanner;

public class _004AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();

        int ans = getValue(n, sourceBase, destBase);
        System.out.println(ans);

        scn.close();
    }

    public static int getValue(int n, int sourceBase, int destBase) {

        int decValue = getVAlueInDecimal(n, sourceBase);
        int decToDestValue = getVAlueInBase(decValue, destBase);

        return decToDestValue;
    }

    public static int getVAlueInBase(int n, int b) {
        int rv = 0;
        int p = 1;

        while (n > 0) {
            int dig = n % b;
            n /= b;

            rv += dig * p;
            p *= 10;
        }

        return rv;
    }

    public static int getVAlueInDecimal(int n, int b) {
        int rv = 0;
        int p = 1;

        while (n > 0) {
            int dig = n % 10;
            n /= 10;

            rv += dig * p;
            p *= b;
        }

        return rv;
    }
}
