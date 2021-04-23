package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC66 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        StringBuilder sb = new StringBuilder("");
        while ((s = bf.readLine())!= null){
            int a = Integer.parseInt(s);
            for (int i = 0; i < a; i++){
                for (int j = 0; j < a; j++){
//                    System.out.print(" ");
                    if (j == i)
//                        System.out.print("*");
                        sb.append("*");
                    else
                        sb.append(" ");
                }
//                System.out.println();
                sb.append("\n");
            }
            System.out.print(sb);
            sb.setLength(0);
        }
    }
}
