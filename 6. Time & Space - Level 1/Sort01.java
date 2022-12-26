import java.util.Scanner;

public class Sort01 {

    public static void sort01(int[] arr) {

        // int pivot = 0;
        // partition(arr, pivot);

        int i = 0;
        int j = 0;

        while (i < arr.length) {
            if(arr[i] == 1){
                i++;
            } else {
                swap(arr, i, j);
                i++;
                j++;
            }
        }
    }

    // public static void partition(int[] arr, int pivot) {
    //     // 0 to j - 1 -> <= pivot
    //     // j to i - 1 -> > pivot
    //     // i to e -> unknown

    //     int i = 0;
    //     int j = 0;

    //     while (i < arr.length) {
    //         if(arr[i] > pivot){
    //             i++;
    //         } else {
    //             swap(arr, i, j);
    //             i++;
    //             j++;
    //         }
    //     }
    // }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        sort01(arr);
        print(arr);
    }
}
