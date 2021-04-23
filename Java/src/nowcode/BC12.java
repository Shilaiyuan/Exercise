package nowcode;
//题目描述
//        输入一个字符，用它构造一个三角形金字塔。
//输入描述:
//        输入只有一行，一个字符。
//输出描述:
//        该字符构成的三角形金字塔。



import java.io.IOException;

public class BC12 {
//    System.in是InputStream指向命令行的输入字节流
//    read()是以字节流的方式来回读取命令行的输入数据,返回数据类型为byte
    public static void main(String[] args)throws IOException {
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
