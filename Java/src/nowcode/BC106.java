package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 上三角矩阵
 *
 */
public class BC106 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++){
            String[] s = bf.readLine().split(" ");
            for (int j = 0; j < i; j++){
                if (Integer.parseInt(s[j]) != 0){
                    System.out.print("NO");
                    return;
                }
            }
        }
        System.out.print("YES");
    }
}
