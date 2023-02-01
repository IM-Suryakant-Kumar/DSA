import java.util.Scanner;

public class DigitsOfNum {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int div = 0;
        int t = n;
        while (t >= 10) {
            t = t / 10;
            div *= 10;
        }

        while (div != 0) {
            int q = n / div;
            System.out.println(q);
            n = n % div;
            div = div / 10;
        }

        sc.close();
    }
}
