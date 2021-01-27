package Test7;

import com.sun.org.apache.xpath.internal.objects.XString;

/**
 * 不定长参数
 *
 * */
public class variablelengthParameter {
//    使用不定长参数放于后面
    public static void temp1(int n, String... args) {
        System.out.println(" ");
    }

    public static void main(String[] args){
        temp1(1,"as","ad","sg");
    }
//    不定长参数只能做形参，在程序内部相当于数组

}
