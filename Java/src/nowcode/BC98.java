package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC98 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[] str = bf.readLine().split(" ");
        int target = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            if (target == Integer.parseInt(str[i])){
                continue;
            }else {
                sb.append(str[i]).append(" ");
            }
        }
        System.out.println(sb);
        sb.setLength(0);
    }
}
