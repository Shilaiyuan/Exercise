package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC84 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while ((s = bf.readLine())!= null){
            int n = Integer.parseInt(s);
            if (n < 0){
                System.out.println(1);
            }else if (n == 0){
                System.out.println(0);
            }else {
                System.out.println(-1);
            }
        }
    }
}
