import java.util.Scanner;

public class _002DecToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);

        scn.close();
    }

    public static int getValueInBase(int n, int b) {
     
        int db = 0;
        int mul = 1;

        while(n != 0) {
            db += n % b * mul;
            n /= b;
            mul *= 10;
        }

        return db;
    }
}
