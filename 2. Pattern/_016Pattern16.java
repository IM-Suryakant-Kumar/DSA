import java.util.Scanner;

public class _016Pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int st = 1, sp = (2 * n) - 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++) {
                System.out.print(j + "\t");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            if (i == n) {
                st--;
            }
            for (int j = st; j >= 1; j--) {

                System.out.print(j + "\t");
            }
            System.out.println();

            st++;
            sp -= 2;
        }

        scn.close();
    }
}
