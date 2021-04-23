package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC86 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int countodd = 0;
        if (n%2 == 0){
            countodd = n/2;
        }else {
            countodd = (n - 1)/2;
        }
        System.out.printf((n-countodd) + " " + countodd);
    }
}
