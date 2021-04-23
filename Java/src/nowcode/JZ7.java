package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 斐波那契数列
 * */
public class JZ7 {
//    直接使用递归
    public int Fibomacci(int n){
        if (n <= 1)
            return n;
        return Fibomacci(n-1) + Fibomacci(n-2);
    }

    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(bf.readLine());
        JZ7 sol = new JZ7();
        System.out.print(sol.Fibomacci(i));
    }
}
