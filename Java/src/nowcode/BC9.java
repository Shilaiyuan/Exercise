package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//学生基本信息输入输出
/*题目描述
        依次输入一个学生的学号，以及3科（C语言，数学，英语）成绩，在屏幕上输出该学生的学号，3科成绩。
输入描述:
        学号以及3科成绩，学号和成绩之间用英文分号隔开，成绩之间用英文逗号隔开。
输出描述:
        学号，3科成绩，输出格式详见输出样例。
示例1
    输入
        17140216;80.845,90.55,100.00
    输出
        The each subject score of  No. 17140216 is 80.85, 90.55, 100.00.*/

public class BC9 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("[;,]");
        String a = String.format("%2d",Long.parseLong((str[0])));
        String b = String.format("%.2f",Double.parseDouble((str[1])));
        String c = String.format("%.2f",Double.parseDouble((str[2])));
        String d = String.format("%.2f",Double.parseDouble((str[3])));
        //注意"of"后面有两个空格，", "后面有1个空格
        System.out.println("The each subject score of  No. " + a + " is " + b + ", " + c +", " + d + ".");
    }
}
