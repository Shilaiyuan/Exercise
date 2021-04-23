package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 输入体重，身高，输出BMI指数
 *
 * */
public class BC25 {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] str = input.readLine().split(" ");
        int[] a = new int[str.length];
        for (int i = 0; i<a.length; i++){
            a[i] = Integer.parseInt(str[i]);
        }
        System.out.printf("%.2f",a[0]/((a[1]/100.00)*(a[1]/100.00)));
    }
//    70 170
}
