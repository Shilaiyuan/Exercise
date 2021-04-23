package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC47 {
    public static void main(String[] args)throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        String vovel = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        while ((str = input.readLine())!= null){
            char c = str.charAt(0);
            if (vovel.indexOf(c) != -1){
                System.out.println(c + " is an alphabet.");
            }else {
                System.out.println(c + " is not an alphabet.");
            }
        }
    }
}
