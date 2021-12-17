package nowcode;

import java.util.Scanner;

//设计一个方法，将一个小于2147483647的double类型变量转化为int类型
public class JAVA1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        System.out.println(JAVA1.typeConsverion(d));
    }

    public static int typeConsverion(double d){
        int ret = (int) d;
        return ret;
    }

}
