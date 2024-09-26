import java.util.Scanner;

public class _019Pattern19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                Boolean sp1 = (i > 1 && j <= n / 2 && i <= n / 2);
                Boolean sp2 = (j > n / 2 + 1 && j < n && i <= n / 2);
                Boolean sp3 = (i > n / 2 + 1 && j > 1 && j <= n / 2);
                Boolean sp4 = (i > n / 2 + 1 && j > n / 2 + 1 && i < n);

                if (sp1 || sp2 || sp3 || sp4) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }

            }
            System.out.println();
        }

        scn.close();
    }
}
