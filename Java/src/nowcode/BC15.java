package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*题目描述

        输入两个整数，范围-231~231-1，交换两个数并输出。

输入描述:
        输入只有一行，按照格式输入两个整数，范围，中间用“,”分隔。
输出描述:
        把两个整数按格式输出，中间用“,”分隔。
示例1
   输入
        a=1,b=2
    输出
        a=2,b=1*/

public class BC15 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        String[] s = str.split(",");
        String[] s_a = s[0].split("=");
        String[] s_b = s[1].split("=");
        System.out.print(s_a[0] + "=" +s_b[1] + "," + s_b[0] + "=" +s_a[1]);
    }
}
