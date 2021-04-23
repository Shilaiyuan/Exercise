package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 输出杨辉三角
 * */
public class BC109 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i)
                    arr[i][j] = 1;
                else
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i + 1; j++){
                int len = (arr[i][j] + "").length();
                for(int k = 0; k < 5 - len; k++){
                    sb.append(" ");
                }
                System.out.print(sb.toString() + arr[i][j]);
                sb.setLength(0);
            }
            if(i != n - 1)  System.out.println();
        }
    }
}
