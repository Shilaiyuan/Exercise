package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC46 {
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        String vovel = "AEIOUaeiou";
//        char[] vovel = {'A','E','I','O','U','a','e','i','o','u'};
        while ((str = input.readLine())!= null){
            char c = str.charAt(0);
            if (vovel.indexOf(c) != -1){
                System.out.println("Vowel");
            }else {
                System.out.println("Consonant");
            }
        }
    }
}
