import java.util.Scanner;

public class _001DigitFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);

        scn.close();
    }

    public static int getDigitFrequency(int n, int d) {
        int fod = 0; // Freaquency of digit

        while(n != 0) {
            if(n % 10 == d) {
                fod++;
            }
            n /= 10;

        }

        return fod;
    }
}
