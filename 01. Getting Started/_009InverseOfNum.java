import java.util.Scanner;

public class _009InverseOfNum {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int posidx = 1; // First index at start
        int inv = 0;  // inverse at start

        while (n != 0) {
            int invidx = n % 10;  // inverse index
            inv += posidx * Math.pow(10, invidx - 1);
            posidx++;
            n = n / 10;
        }

        System.out.println(inv);

        sc.close();
    }
}
