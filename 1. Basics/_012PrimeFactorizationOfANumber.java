import java.util.Scanner;

public class _012PrimeFactorizationOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                System.out.print(i + " ");
            }
        }

        if (n != 1) {
            System.out.print(n);
        }

        sc.close();
    }
}
