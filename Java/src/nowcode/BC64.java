package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC64 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        StringBuilder sb = new StringBuilder();
        while ((s = bf.readLine())!= null){
            int n = Integer.parseInt(s);
//            打印上部
            for (int i = n; i > 0; i--){
                for (int j = i + 1; j > 0; j--){
                    sb.append("* ");
                }
                for (int j = 0; j < n - i; j++){
                    sb.append(' ');
                }
                sb.append("\n");
            }
//            打印下部
            for(int i = 0; i <= n; i++){
                for (int j = i + 1; j > 0; j--){
                    sb.append("* ");
                }
                for (int j = n; j > i; j--){
                    sb.append(' ');
                }
                sb.append("\n");
            }
            System.out.print(sb);
            sb.setLength(0);
        }
    }
}
