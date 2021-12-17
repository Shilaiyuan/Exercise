package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 日期：2021-5-20
 * 题目描述：输入一个32位有符号整数x，返回x反转后的结果
 * */
public class _7_integerReverse {
    public int reverse(int x){
        if (x < -2147483648 || x > 2147483647)
            return 0;
        String s = Integer.toString(x);
        StringBuffer str = new StringBuffer(s);
        if(str.charAt(0) != '-'){
            return Integer.parseInt(str.reverse().toString());
        }else{
//            第一位为符号位，不占长度？
            StringBuffer ret = new StringBuffer(str.substring(1, str.length()));
            return - Integer.parseInt(ret.reverse().toString());
        }

    }

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bf.readLine());
        _7_integerReverse sol = new _7_integerReverse();
        System.out.println(sol.reverse(x));
    }
}
