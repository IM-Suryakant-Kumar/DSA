import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // String s1 = "Hello";
        // System.out.println(s1);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt(); 
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt(); 
        }
        for (int i = 0; i < c.length; i++) {
            c[i] = sc.nextInt(); 
        }

        
    }
}