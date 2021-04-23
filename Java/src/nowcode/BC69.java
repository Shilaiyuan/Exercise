package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC69 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        StringBuilder sb = new StringBuilder();
        while((s = bf.readLine())!= null){
            int n = Integer.parseInt(s);
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    if ((i == 0) || (i == n -1) || (j == 0) || (j == n-1)){
                        sb.append("* ");
                    }else {
                        sb.append("  ");
                    }
                }
                sb.append("\n");
            }
            System.out.print(sb);
            sb.setLength(0);
        }
    }
}
