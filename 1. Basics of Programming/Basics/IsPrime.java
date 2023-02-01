import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int t = scn.nextInt();
        for(int i = 1; i <= t; i++){
            int n = scn.nextInt();
            if(isPrime(n)){
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }

        scn.close();
    }

    public static boolean isPrime(int n){

        for (int j = 2; j * j <= n; j++) {
            if(n % j == 0){
                return false;
            }
        }

        return true;
    }
}
