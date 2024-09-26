import java.util.Scanner;

public class _009FindElemInAnArray {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        
        scn.close();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == d) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);


    }
}
