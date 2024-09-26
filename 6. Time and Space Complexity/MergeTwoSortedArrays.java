import java.util.Scanner;

public class MergeTwoSortedArrays {

    public static int[] mergeTwoSortedArrays(int[] arr, int[] arr1) {

        int[] res = new int[arr.length + arr1.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr.length && j < arr1.length) {
            if (arr[i] < arr1[j]) {
                res[k] = arr[i];
                i++;
                k++;
            } else {
                res[k] = arr1[j];
                j++;
                k++;
            }
        }

        while (i < arr.length) {
            res[k] = arr[i];
            i++;
            k++;
        }

        while (j < arr1.length) {
            res[k] = arr1[j];
            j++;
            k++;
        }

        return res;
    }

    public static void print(int[] res) {
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }

        int[] res = mergeTwoSortedArrays(arr, arr1);
        print(res);
    }
}
