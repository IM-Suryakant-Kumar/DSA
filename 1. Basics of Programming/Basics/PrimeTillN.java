import java.util.Scanner;

public class PrimeTillN {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for(int i = low; i <= high; i++){
            if(isPrime(i)){
                System.out.println(i);
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
