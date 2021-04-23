package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC75 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        StringBuilder sb = new StringBuilder();
        while((s = br.readLine()) != null){
            int n = Integer.parseInt(s);
            for (int i = 1;i<=n ;i++) {
                for(int j=1; j<=i; j++) {
                    sb.append(j);
                    sb.append(" ");
                }
                sb.append("\n");
            }
            System.out.print(sb);
            sb.setLength(0);
        }
    }
}
