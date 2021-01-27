package Test7;
/**
 * 数据类型和存储方式
 * */
/**
 * 基本数据类型8种: byte short int long float double char boolean
 * 定义方法：数据类型 变量名 = 值;
 * 存放位置：栈
 * 传递方式：值传递
 * */

import java.util.Arrays;

/**
 * 引用数据类型：除基本数据类型以外的数据类型，如String，int[]
 * 定义方法： 数据类型 变量名 = new 数据类型();
 * 存放位置： 变量地址存放在栈内，数据存放在堆中
 * 传递方式：（引用传递）地址传递
 * */
public class StoreWay {
    public static void main(String[] args){
        //基本数据类型传递的是值
        int a = 5;
        int b = a;
        System.out.println("b = " + b);
        b = 8;
        System.out.println("a = " + a + "/n" +"b = " + b);

        //引用数据类型的传递是地址传递
        int[] arr = {4,5,6,7};
        int[] brr = arr;
        brr[1] = 555;
        System.out.println("arr = " + Arrays.toString(arr));

        Change(a, arr);
        System.out.println("a = " + a);
        System.out.println("arr = " + Arrays.toString(arr));
    }

    public static void Change(int a, int[] b){
        a = 10;
        b[b.length-1] = 444;
    }
}
