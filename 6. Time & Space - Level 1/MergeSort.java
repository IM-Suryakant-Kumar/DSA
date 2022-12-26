import java.util.Scanner;

public class MergeSort {

    public static int[] mergeSort(int[] arr, int lo, int hi) {

        if (lo == hi) {
            int[] ba = new int[1];
            ba[0] = arr[lo];
            return ba;
        }

        int mid = (lo + hi) / 2;
        int[] fsh = mergeSort(arr, lo, mid);
        int[] ssh = mergeSort(arr, mid + 1, hi);
        int[] fsa = MergeTwoSortedArrays(fsh, ssh);
        return fsa;
    }

    public static int[] MergeTwoSortedArrays(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                res[k] = a[i];
                i++;
            } else {
                res[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            res[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            res[k] = b[j];
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

        int[] sa = mergeSort(arr, 0, arr.length - 1);
        print(sa);
    }
}
