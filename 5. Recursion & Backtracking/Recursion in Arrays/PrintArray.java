import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        // printArray(arr, n);
        printArray1(arr, 0);
    }

    public static void printArray(int[] arr, int n){
        
        if(n == 0){
            return;
        }

        printArray(arr, n - 1);
        System.out.println(arr[n - 1]);
    }

    public static void printArray1(int[] arr, int idx){

        if(idx == arr.length){
            return;
        }

        System.out.println(arr[idx]);
        printArray1(arr, idx + 1);
    }
}