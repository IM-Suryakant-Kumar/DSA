import java.util.Scanner;

public class _008Pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // int nStarts = n;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= nStarts; j++) {
        // if(j < nStarts) {
        // System.out.print("\t");
        // } else {
        // System.out.print("*\t");
        // }
        // }
        // nStarts--;
        // System.out.println();
        // }

        // Type2
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j == n + 1) {
                    System.out.print("*\t");
                    break;
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

        scn.close();

    }
}
