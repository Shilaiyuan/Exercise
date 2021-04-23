package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC73 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int score = Integer.parseInt(s);
        if (score > 10)
            System.out.println("Danger++");
        if (score <= 10 && score >= 4)
            System.out.println("Danger");
        if (score < 4 && score >= 0)
            System.out.println("Good");
    }
}
