package nowcode;

import java.io.IOException;

//字符金字塔
/*题目描述
        输入一个字符，用它构造一个三角形金字塔。
输入描述:
        输入只有一行，一个字符。
输出描述:
        该字符构成的三角形金字塔。
示例1
     输入
        1
     输出
        1
       1 1
      1 1 1
     1 1 1 1
    1 1 1 1 1*/
public class BC10 {
    public static void main(String[] args)throws IOException {
//        输入为字符型，直接使用System.in.read()
        char c = (char)System.in.read();
        int count = 4;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < count -i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
