import java.util.Scanner;

public class _011Pattern11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int c = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + "\t");
                c++;
            }
            System.out.println();
        }

        scn.close();
    }
}
