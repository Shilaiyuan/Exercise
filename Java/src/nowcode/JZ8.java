package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 青蛙跳台阶
 * */
/**
 * 对于第n个台阶来讲，只能从n-1或n-2个台阶跳上来，F(n) = F(n-1) + F(n-2)
 * 初始条件 F(1) = 1; F(2) = 2
 * */
public class JZ8 {
    public int JumpFloor(int target){
        if(target == 0 || target == 1)
            return target;
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 2; i < target; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        JZ8 temp = new JZ8();
        System.out.print(temp.JumpFloor(a));
    }
}
