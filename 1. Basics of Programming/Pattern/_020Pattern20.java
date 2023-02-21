import java.util.Scanner;

public class _020Pattern20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                boolean st1 = (j == 1 || j == n);
                boolean st2 = (i >= n / 2 + 1 && i + j == n + 1);
                boolean st3 = (i >= n / 2 + 1 && i == j);

                if (st1 || st2 || st3) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }

        scn.close();
    }
}
