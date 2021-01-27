package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
题目描述
        BoBo教KiKi字符常量或字符变量表示的字符在内存中以ASCII码形式存储。BoBo出了一个问题给KiKi，输入一个字符，输出该字符相应的ASCII码。
输入描述:
        一行，一个字符。
输出描述:
        一行，输出输入字符对应的ASCII码。
示例1
     输入
        c
     输出
        99
*/

public class BC16 {
    public static void main(String[] args)throws IOException {
//        直接使用Java默认的数据类型转换
       int c = System.in.read();
       System.out.print(c);
    }
}
