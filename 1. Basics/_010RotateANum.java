import java.util.Scanner;

public class _010RotateANum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number to rotate
        int k = sc.nextInt(); // Number of steps to rotate

        // Calculate Number of digit
        int nod = 0; // Number of digit
        int t = n;
        while (t != 0) {
            t = t / 10;
            nod++;
        }
        // 25398 will give nod = 5

        // Handle Edge cases
        k %= nod;
        if (k < 0) {
            k = k + nod;
        }

        // Calculate divisor and multiplier
        int d = 1; // Divisor
        int m = 1; // Multiplier

        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                d = d * 10; // Divisor will be 100
            } else {
                m = m * 10; // multiplier will be 1000
            }
        }

        // Perform Rotation
        int r = n % d; // r = right most digit // if k = 2 then right most digit will be 98
        int l = n / d; // l = left most digits // if k = 2 then right most digit will be 253
        int rn = r * m + l; // rn = Rotated number // rotated number will be 98 * 1000 + 253;
        System.out.println(rn);

        sc.close();
    }
}
