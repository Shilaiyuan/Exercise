package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC44 {
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        String str = null;
        while ((str = input.readLine())!= null){
            a = Integer.parseInt(str);
            if (a%2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }
    }
}
