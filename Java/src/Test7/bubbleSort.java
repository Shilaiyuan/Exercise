package Test7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入一串数组，按照冒泡排序打印输出
 * */
public class bubbleSort {

    static int[] result;
    public static void main(String[] args){
        System.out.println("请输入要排序的数组： ");
        String str;
        Scanner input = new Scanner(System.in);
//        读取输入
//        str = input.nextLine().toString();
//        nextLine返回值为一行String
        str = input.nextLine();
        String arr[] = str.split(",");
        int a[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            a[i] = Integer.parseInt(arr[i]);
        }

//        冒泡排序
//        因为每次排序均为向后排，所以i<a.length-1,j在i右侧，更小一位
        for (int i = 0; i< a.length -1; i++){
            for (int j = 0; j< a.length - i -1;j++ ){
//                前方元素大于后方则换位
                if (a[j] > a[j+1]){
                    a[j] += a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];
                }
            }
        }
        result = a;
        System.out.println("排序结果：");
        System.out.println(Arrays.toString(result));

//        实际上的升序排序
        Arrays.sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
//        再反转折腾一次
        String s = Arrays.toString(arr);
        StringBuffer stringBuffer1 = new StringBuffer(s);
        System.out.println(stringBuffer1.reverse().toString());
//        龟龟！中括号都换了
        s = s.replace('[',' ');
        s = s.replace(']',' ');
        s = s.trim();
        StringBuffer stringBuffer2 = new StringBuffer(s);
        System.out.println("[" + stringBuffer2.reverse().toString() + "]");
    }
}
