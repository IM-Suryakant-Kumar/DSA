import java.util.Scanner;

public class IndicesOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        int d = scn.nextInt();

        int[] ans = indices(arr, 0, d, 0);
        display(ans);
        
        
        // indices1(arr, 0, d);
    }

    public static int[] indices(int[] arr, int idx, int d, int fsf){

        if(idx == arr.length){
            return new int[fsf];
        }

         if(arr[idx] == d){
            int[] arr1 = indices(arr, idx + 1, d, fsf + 1);
            arr1[fsf] = idx;
            return arr1;
         } else {
            int[] arr1 = indices(arr, idx + 1, d, fsf);
            return arr1;
         }
    }

    private static void display(int[] ans) {
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }

//     private static void indices1(int[] arr, int idx, int d) {
        
//         if(idx == arr.length){
//             return;
//         }

//         if(arr[idx] == d){
//             System.out.print(idx + " ");
//         }
//         indices1(arr, idx + 1, d);
//     }
    
}
