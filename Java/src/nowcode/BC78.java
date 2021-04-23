package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 筛选法求素数
 * */
public class BC78 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while ((s = bf.readLine())!= null){
            int n = Integer.parseInt(s);
            boolean flag = false;
            int count = 0;
            for (int i = 2; i <= n; i++){
                flag = true;
                for (int j = 2; j < i; j++){
                    if (i%j == 0){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    System.out.print(i + " ");
                    count++;
                }
            }
            System.out.println();
            System.out.println(n - count - 1);
        }
    }
}
