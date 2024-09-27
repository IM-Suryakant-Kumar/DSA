import java.util.Scanner;

public class PrintPermutation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String ques = scn.nextLine();
        printPermutation(ques, "");
    }

    public static void printPermutation(String ques, String asf) {
        if (ques.length() == 0) {
            System.out.println(asf);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String qlPart = ques.substring(0, i);
            String qrPart = ques.substring(i + 1);
            String roq = qlPart + qrPart;
            printPermutation(roq, asf + ch);
        }
    }
}
