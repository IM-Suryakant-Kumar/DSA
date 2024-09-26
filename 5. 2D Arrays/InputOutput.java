import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        output(arr);
    }

    public static void output(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}

// Input
// 2 3
// 2 4 6
// 2 4 6
// Output
// [2, 4, 6, ]
// [2, 4, 6, ]