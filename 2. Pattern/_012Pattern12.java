import java.util.Scanner;

public class _012Pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + "\t");
                // forming next fibbonacci
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }

        scn.close();
    }
}
