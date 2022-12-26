import java.util.ArrayList;
import java.util.Scanner;

public class GetKeyPad {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> words = getkpc(str);
        System.out.println(words);
    }
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "nmo", "pqrs", "tu", "vwx", "yz"};
    public static ArrayList<String> getkpc(String str){

        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        ArrayList<String> rres = getkpc(ros);
        ArrayList<String> mres = new ArrayList<>();

        String codesForch = codes[ch - '0'];
        for(int i = 0; i < codesForch.length(); i++){
            char chCode = codesForch.charAt(i);
            for(String rstr : rres){
                mres.add(chCode + rstr);
            }
        }
        return mres;
    }
}