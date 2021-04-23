package luogu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 两数相加
 * */
public class P1001 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        int[] input = new int[str.length];
        for (int i = 0; i < input.length; i++){
            input[i] = Integer.parseInt(str[i]);
        }
        System.out.print(input[0] + input[1]);
    }
}
