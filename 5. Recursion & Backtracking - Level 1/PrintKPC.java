import java.util.Scanner;

public class PrintKPC {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printKpc(str, "");
    }
    static String[] codes = {".,", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKpc(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        String codeforch = codes[ch - '0'];
        for(int i = 0; i < codeforch.length(); i++){
            char cho = codeforch.charAt(i);
            printKpc(roq, ans + cho);
        }
    }
}