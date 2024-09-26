import java.util.Scanner;

public class _011SumOfTwoArrays {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }

        int n3 = n1 > n2 ? n1 : n2;
        int[] sum = new int[n3];

        int i = n1 - 1;
        int j = n2 - 1;
        int k = n3 - 1;
        int c = 0;
        while (i >= 0 || j >= 0) {
            int d = c;
            if (i >= 0) {
                d += arr1[i];
                i--;
            }

            if (j >= 0) {
                d += arr2[j];
                j--;
            }

            if (k == 0) {
                sum[k] = d;
                continue;
            }

            c = d / 10;
            d %= 10;
            sum[k] = d;
            k--;
        }

        for (int value : sum) {
            System.out.println(value);
        }

        scn.close();
    }
}
