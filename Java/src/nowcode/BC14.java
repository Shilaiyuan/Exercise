package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**题目描述
        输入一个人的出生日期（包括年月日），将该生日中的年、月、日分别输出。
输入描述:
        输入只有一行，出生日期，包括年月日，年月日之间的数字没有分隔符。
输出描述:
        三行，第一行为出生年份，第二行为出生月份，第三行为出生日期。输出时如果月份或天数为1位数，需要在1位数前面补0。

示例1
        输入
        20130225
        输出
        year=2013
        month=02
        date=25
 */

public class BC14 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str =  bf.readLine();
        System.out.println("year="+str.substring(0,4));
        System.out.println("month="+str.substring(4,6));
        System.out.println("date="+str.substring(6,8));
    }
}
