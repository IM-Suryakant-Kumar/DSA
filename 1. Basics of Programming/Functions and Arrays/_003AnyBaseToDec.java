import java.util.Scanner;

public class _003AnyBaseToDec {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);

        scn.close();
     }
    
     public static int getValueIndecimal(int n, int b){
        // write your code here
        int rv = 0;
        int mul = 1;

        while(n > 0) {
            int dig = n % 10;
            n /= 10;

            rv += dig * mul;
            mul *= b;
        }

        return rv;
     }
}
