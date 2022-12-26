import java.util.Scanner;

public class SelectionSort {

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (isSmaller(arr, j, min)) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
        return arr;
    }

    public static boolean isSmaller(int[] arr, int i, int j) {
        return (arr[i] < arr[j]);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
        int[] newArr = selectionSort(arr);
        print(newArr);
    }
}
