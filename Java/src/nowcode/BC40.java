package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * 竞选社长
 * */
public class BC40 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = bf.readLine().toCharArray();
//        设法使用count_value函数失败(java中没有)
        int a = 0, b = 0;
        for (int i = 0; i < arr.length-1; i++){
            if(arr[i] == 'A')
                a++;
            else
                b++;
        }
        if (a > b)
            System.out.println('A');
        if (a < b)
            System.out.println('B');
        if (a == b)
            System.out.println('E');
    }
}
