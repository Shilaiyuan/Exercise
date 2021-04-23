package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC99 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[] str = bf.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(str[0]).append(" ");
        for (int i = 1; i < N; i++){
            boolean appear = false;
            for ( int j = 0; j < i; j++){
//                如果先前该数已出现过一次，则不再计入
                if (Integer.parseInt(str[j]) == Integer.parseInt(str[i])){
                    appear = true;
                }
            }
            if (!appear){
                sb.append(str[i]).append(" ");
            }
        }
        System.out.println(sb);
        sb.setLength(0);
    }
}