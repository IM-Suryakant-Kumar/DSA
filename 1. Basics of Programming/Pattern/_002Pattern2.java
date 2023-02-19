import java.util.Scanner;

public class _002Pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        // // Type one
        // for (int i = 1; i <= n; i++) {
        // for(int j = 1; j <= n - i + 1; j++) {
        // System.out.print("*\t");
        // }
        // System.out.println();
        // }

        // Type Two
        int nStarts = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nStarts; j++) {
                System.out.print("*\t");
            }
            nStarts--;
            System.out.println();
        }

        scn.close();

    }
}
