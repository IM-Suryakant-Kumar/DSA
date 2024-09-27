import java.util.Scanner;

public class QuickSelect {

    public static int quickSelect(int[] arr,int lo, int hi, int k) {
        // write code
        int pivot = arr[hi];
        int pi = partition(arr, pivot,lo, hi);

        if(k < pi){
            return quickSelect(arr, lo, pi - 1, k);
        } else if(k > pi){
            return quickSelect(arr, pi + 1, hi, k);
        } else{
            return pivot;
        }
    }

    public static int partition(int[] arr, int pivot,int lo, int hi) {
        // 0 to j - 1 -> <= pivot
        // j to i - 1 -> >pivot
        // i to e -> unknown
        int i = lo;
        int j = lo;

        while (i < arr.length) {
            if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }

        return (j - 1);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();
        int ksElem = quickSelect(arr, 0, arr.length - 1, k - 1);
        System.out.println(ksElem);
    }
}
