import java.util.Scanner;

public class AllPalindromicSubtring {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solution(str);
    }

    // Substring calculating
    public static void solution(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substr = str.substring(i, j);
                if (isPalindrome(substr)) {
                    System.out.println(substr);
                }
            }
        }
    }

    // Palindrome Checking
    public static boolean isPalindrome(String str) {
        int li = 0;
        int ri = str.length() - 1;
        while (li < ri) {
            if (str.charAt(li) != str.charAt(ri)) {
                return false;
            }
            li++;
            ri--;
        }
        return true;
    }

}
