package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC28 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while((str = input.readLine())!= null){
            System.out.println(str.toLowerCase());
        }
    }

}
