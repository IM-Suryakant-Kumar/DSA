import java.util.Scanner;

public class _011GcdAndLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int t1 = num1;
        int t2 = num2;

        while(t1 != 0) {
            int t = t1;
            t1 = t2 % t1;
            t2 = t;
        }

        int gcd = t2;
        int lcm = num1 * num2 / gcd;

        System.out.println(gcd);
        System.out.println(lcm);

        sc.close();
    }
}
