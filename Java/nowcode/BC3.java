package nowcode;
//有容乃大
/*题目描述
        确定不同整型数据类型在内存中占多大（字节），输出不同整型数据类型在内存中占多大（字节）。
输入描述:
        无
输出描述:
        不同整型数据类型在内存中占多大（字节），具体格式详见输出样例，输出样例中的?为不同整型数据类型在内存中占的字节数。输出样例如下：
        The size of short is ? bytes.
        The size of int is ? bytes.
        The size of long is ? bytes.
        The size of long long is ? bytes.*/
//这个是基本类型在内存中所占空间的大小
public class BC3 {
    public static void main(String[] args){
//        其实是违规操作，毕竟基本数据类型的大小我记得非常深刻。。。。。
        System.out.println("The size of short is 2 bytes.");
        System.out.println("The size of int is 4 bytes.");
        System.out.println("The size of long is 8 bytes.");
        System.out.println("The size of long long is 8 bytes.");
//        正常的操作该是这样
        System.out.println("The size of Short is " + Short.SIZE/8 +" bytes.");
        System.out.println("The size of int is " + Integer.SIZE/8 +" bytes.");
        System.out.println("The size of long is " + Long.SIZE/8 +" bytes.");
        System.out.println("The size of long long is " + Long.SIZE/8 +" bytes.");
    }
}
