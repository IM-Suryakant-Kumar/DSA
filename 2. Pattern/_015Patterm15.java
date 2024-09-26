import java.util.Scanner;

public class _015Patterm15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int sp = n / 2, st = 1, rowc = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            int colc = rowc;
            for (int j = 1; j <= st; j++) {
                System.out.print(colc + "\t");
                if(j <= st / 2) {
                    colc++;
                } else {
                    colc--;
                }
            }
            System.out.println();

            if (i <= n / 2) {
                st += 2;
                sp--;
                rowc++;
            } else {
                st -= 2;
                sp++;
                rowc--;
            }
        }

        scn.close();
    }
}
