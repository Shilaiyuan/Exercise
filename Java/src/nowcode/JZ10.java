package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 *
 * 矩形覆盖
 * 依旧是斐那波切数列
 * */
public class JZ10 {
    public int rectCover(int target){
        if (target == 0|| target == 1)
            return target;
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= target; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        JZ10 sol = new JZ10();
        System.out.print(sol.rectCover(a));
    }
}
