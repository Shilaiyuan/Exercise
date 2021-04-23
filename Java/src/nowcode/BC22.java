package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 一年约有3.156*10^7s,要求输入你的年龄，显示该年龄合多少秒
 * */
public class BC22 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Long ageYears = Long.parseLong(bf.readLine());
        System.out.println(ageYears * 31560000);
    }
}
