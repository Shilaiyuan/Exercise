package nowcode;
//计算带余数除法
/*
题目描述
        给定两个整数a和b (－10,000 < a,b < 10,000)，计算a除以b的整数商和余数。
输入描述:
        一行，包括两个整数a和b，依次为被除数和除数（不为零），中间用空格隔开。
输出描述:
        一行，包含两个整数，依次为整数商和余数，中间用一个空格隔开。
示例1
    输入
        15 2
    输出
        复制
        7 1
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC18 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader((new InputStreamReader(System.in)));
        String[] str = bf.readLine().split(" ");
        int[] input = new int[str.length];
        for (int i=0; i<input.length; i++)
            input[i] = Integer.parseInt(str[i]);
        System.out.print(input[0]/input[1] + " " +input[0]%input[1]);
    }
}
