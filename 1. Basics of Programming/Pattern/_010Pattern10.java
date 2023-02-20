import java.util.Scanner;

public class _010Pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int sp = n / 2, st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            int sti = 1;
            for (int j = 1; j <= st; j++) {
                if (sti == 1 || sti == st) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
                sti++;
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            System.out.println();

            if (i <= n / 2) {
                sp--;
                st += 2;
            } else {
                sp++;
                st -= 2;
            }
        }

        scn.close();

    }
}
