package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC48 {
    public static void main(String[] args)throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        String supper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        while ((str = input.readLine())!= null){
            char c = str.charAt(0);
            if (lower.indexOf(c) != -1){
                System.out.println(str.toUpperCase());
            }
            if (supper.indexOf(c) != -1){
                System.out.println(str.toLowerCase());
            }
        }
    }
}
