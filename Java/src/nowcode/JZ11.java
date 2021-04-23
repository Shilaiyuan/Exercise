package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 获得输入数字二进制形式中1的个数
 * */

public class JZ11 {
    public int Numberof1(int n){
        String str = null;
//        负数取补码
        if (n < 0){
            str = Integer.toBinaryString(~(-n) + 1);
        }else {
            str = Integer.toBinaryString(n);
        }
        int count = 0;
//        System.out.println(str);
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '1')
                count ++;
        }
        return count;
    }

    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        JZ11 sol = new JZ11();
        System.out.print(sol.Numberof1(a));
    }
}
