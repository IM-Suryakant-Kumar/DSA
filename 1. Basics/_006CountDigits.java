import java.util.Scanner;

public class _006CountDigits {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int c = 0;

        while (n != 0) {
            n = n / 10;
            c = c + 1;
        }

        System.out.println(c);

        sc.close();
    }
}
