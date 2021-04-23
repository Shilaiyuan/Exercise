package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC34 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
//        截取十六进制0x后的字符
        int i1 = Integer.parseInt(str[0].substring(2),16);
        int i2 = Integer.parseInt(str[1],8);
        System.out.println(i1 + i2);
    }
}
