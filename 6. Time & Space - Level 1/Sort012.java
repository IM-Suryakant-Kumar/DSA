import java.util.Scanner;

public class Sort012 {

    public static void sort012(int[] arr) {
        
        
        
        

        int i = 0; // 0 to j - 1 -> == 0
        int j = 0; // j to i - 1 -> == 1
        int k = arr.length - 1; // k + 1 to end -> == 2

        // i to k -> unknown
        while(i <= k){
            if(arr[i] == 0){
                swap(arr, i, j);
                i++;
                j++;
            } else if(arr[i] == 1){
                i++;
            } else{
                swap(arr, i, k);
                k--;
            }
        }
    }

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

        sort012(arr);
        print(arr);
    }
}
