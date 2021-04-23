package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC41 {
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int IQ = 0;
        String str = input.readLine();
        IQ = Integer.parseInt(str);
        if (IQ >= 140)
            System.out.println("Genius");
        else
            System.out.println();
    }
}
