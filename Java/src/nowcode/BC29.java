package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 不使用乘法，使用按位运算输出2的次方
 * */
public class BC29 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = input.readLine())!= null){
            int a = Integer.parseInt(str);
            System.out.println(2<<(a-1));
        }
    }
}
