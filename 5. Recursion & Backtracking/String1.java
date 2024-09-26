import java.util.Scanner;

public class String1{
    public static void main(String[] args){
        // Scanner scn = new Scanner(System.in);
        // String s2 = scn.nextLine();

        // System.out.println(s2);
        // System.out.println(s2.length());

        // char ch = s2.charAt(0);
        // System.out.println(ch);
        
        // String str = "abcd";
        // String ss = str.substring(1, 1);
        // System.out.print(str.substring(1, 3));
        // System.out.print(ss);
        // System.out.print(str.substring(2, 4));

        // String str = "Hello";
        // System.out.println(str + 10 + 20);
        // System.out.println(10 + 20 + str);

        String s = "abc,def,ghi,jkl mno";
        String[] part = s.split(",");
        for(int i = 0; i < part.length; i++){
            System.out.println(part[i]);
        }
    }
}