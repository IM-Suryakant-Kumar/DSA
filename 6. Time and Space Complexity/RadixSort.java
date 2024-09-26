import java.util.Scanner;

public class RadixSort {

    public static void radixSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }

        int exp = 1;
        while (exp <= max) {
            countSort(arr, exp);
            exp *= 10;
        }
    }

    public static void countSort(int[] arr, int exp) {
        int[] ans = new int[arr.length];

        // make frequency arr
        int[] farr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            farr[arr[i] / exp % 10]++;
        }

        // convert it into prefix sum arr
        for (int i = 1; i < farr.length; i++) {
            farr[i] += farr[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i];
            int pos = farr[val / exp % 10];
            int idx = pos - 1;
            ans[idx] = val;
            farr[val / exp % 10]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        radixSort(arr);
        print(arr);
    }
}
