package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 给定一个浮点数，求该浮点数的个位数
 * 方法
 * */
public class BC21 {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] str = input.readLine().split("\\.");
        int a = Integer.parseInt(str[0]);
        System.out.println(a%10);
    }
}
