import java.util.Scanner;

public class _006Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int st = n / 2 + 1, sp = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            System.out.println();

            if (i <= n / 2) {
                sp += 2;
                st--;
            } else {
                sp -= 2;
                st++;
            }
        }

        scn.close();
    }
}

// st sp st
// 3 1 3
// 2 3 2
// 1 5 1
// 2 3 2
// 3 1 3
