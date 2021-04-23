package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC67 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        StringBuilder sb = new StringBuilder("");
        while ((s = bf.readLine())!= null){
            int a = Integer.parseInt(s);
            for (int i = 0; i < a; i++){
                for (int j = 0; j < a; j++){
//                    System.out.print(" ");
                    if (i + j == a - 1){
                        sb.append("*");
                        continue;
                    } else{
                        sb.append(" ");
                    }
                }
//                System.out.println();
                sb.append("\n");
            }
            System.out.print(sb);
            sb.setLength(0);
        }
    }
}
