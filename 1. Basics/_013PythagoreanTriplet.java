import java.util.Scanner;

public class _013PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if (a >= b && a >= c && a * a == b * b + c * c) {
            System.out.println(true);
        } else if (b >= a && b >= c && b * b == a * a + c * c) {
            System.out.println(true);
        } else if (c * c == a * a + b * b) {
            System.out.println(true);
        }

        sc.close();
    }
}
