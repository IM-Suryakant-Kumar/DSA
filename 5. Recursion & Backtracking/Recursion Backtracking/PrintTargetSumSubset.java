import java.util.Scanner;

public class PrintTargetSumSubset {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int tar = scn.nextInt();
        printTargetSumSubset(arr, 0, "", 0, tar);
    }

    // set is subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubset(int[] arr, int idx, String set, int sos, int tar) {
        if(idx == arr.length){
            if (sos == tar) { 
                System.out.println(set+",");
            }
            return;
        }

        printTargetSumSubset(arr, idx + 1, set + arr[idx] + ",", sos + arr[idx], tar);
        printTargetSumSubset(arr, idx + 1, set, sos, tar);
    }
}
