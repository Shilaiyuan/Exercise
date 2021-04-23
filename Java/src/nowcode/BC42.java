package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC42 {
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int score = 0;
        String str = input.readLine();
        score = Integer.parseInt(str);
        if (score >= 90 && score <=100)
            System.out.println("Perfect");
        else
            System.out.println();
    }
}
