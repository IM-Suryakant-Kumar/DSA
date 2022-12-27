import java.util.Scanner;

public class LastIndexOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        int d = scn.nextInt();

        int li = lastIndex(arr, 0, d);

        System.out.println(li);
    }

    public static int lastIndex(int[] arr, int idx, int d) {

        if(idx == arr.length){
            return -1;
        }

        int liisa = lastIndex(arr, idx + 1, d);
        if(liisa == -1 && arr[idx] == d){
            return idx;
        }else{
            return liisa;
        }
    }
    
}
