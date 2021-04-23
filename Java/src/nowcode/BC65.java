package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC65 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while ((s = br.readLine()) != null) {
            int i = Integer.parseInt(s);
            StringBuilder sb = new StringBuilder();
            // 上部三角形
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < 2*(i-j); k++) {
                    sb.append(" ");
                }
                for (int k = 0; k < j+1; k++) {
                    sb.append("*");
                }
                sb.append("\n");
            }
            // 中间部分
            for (int j = 0; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
            // 下部三角形
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < 2*j+2; k++) {
                    sb.append(" ");
                }
                for (int k = 0; k < i - j; k++) {
                    sb.append("*");
                }
                sb.append("\n");
            }
            System.out.print(sb);
        }
    }
}
