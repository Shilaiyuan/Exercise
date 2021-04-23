package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 跳台阶
 * 这次青蛙可以跳1-n级台阶
 * 贪心算法
 * */
public class JZ9 {
    public int jumpFloorII(int target){
        if (target == 0 || target == 1)
            return 1;
//        return (int) Math.pow(2,target-1);
//        直接求幂
        return 0x01 << (target - 1);
    }

    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        JZ9 sol = new JZ9();
        System.out.print(sol.jumpFloorII(a));
    }
}
