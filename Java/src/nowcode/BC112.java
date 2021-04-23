package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 求和
 * */
public class BC112 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int sum = 0;
//        int sum = (1 + n) * n / 2;
        for (int i = 0; i < n; i++){
            sum += i;
        }
        System.out.print(sum);
    }
}
