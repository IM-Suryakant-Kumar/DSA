// import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPair {

    public static void targetSumPair(int[] arr, int target) {
        // Arrays.sort(arr);

        int[] res = mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < res.length; i++) {
            arr[i] = res[i];
        }

        int li = 0;
        int ri = arr.length - 1;
        while (li <= ri) {
            if (arr[li] + arr[ri] < target) {
                li++;
            } else if (arr[li] + arr[ri] > target) {
                ri--;
            } else {
                System.out.println(arr[li] + ", " + arr[ri]);
                li++;
                ri--;
            }
        }
    }

    public static int[] mergeSort(int[] arr, int lo, int hi) {

        if(lo == hi){
            int[] ba = new int[1];
            ba[0] = arr[lo];
            return ba;
        }

        int mid = (lo + hi) / 2;
        
        int[] fsh = mergeSort(arr, lo, mid);
        int[] ssh = mergeSort(arr, mid + 1, hi);
        int[] fsa = mergeTwoSortedArray(fsh, ssh);

        return fsa;
    }

    public static int[] mergeTwoSortedArray(int[] a, int[] b) {
        int[] ans = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                ans[k] = a[i];
                i++;
            } else {
                ans[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            ans[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            ans[k] = b[j];
            j++;
            k++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();

        targetSumPair(arr, target);
    }
}
