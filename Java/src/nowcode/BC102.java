package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC102 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int[][] a = new int[n][m];
        for (int i = 0;i < n; i++){
            String[] arr = bf.readLine().split(" ");
            for (int j = 0; j < arr.length; j++){
                a[i][j] = Integer.parseInt(arr[j]);
            }
        }
        String[] lost = bf.readLine().split(" ");
        int x =Integer.parseInt(lost[0]);
        int y =Integer.parseInt(lost[1]);
        System.out.println(a[x-1][y-1]);
    }
}
