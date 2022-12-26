import java.util.Scanner;

public class PrintArrayReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        printArray1(arr, 0);
    }

    public static void printArray1(int[] arr, int idx){

        if(idx == arr.length){
            return;
        }

        printArray1(arr, idx + 1);
        System.out.println(arr[idx]);
    }
}