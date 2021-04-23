package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 输出转置矩阵;
 * */
public class BC107 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        int m = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);
        int[][] arr = new int[m][n];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++){
            String[] s = bf.readLine().split(" ");
            for (int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                sb.append(arr[j][i]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
        sb.setLength(0);
    }
}
