package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BC100 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] status = bf.readLine().split(" ");
        String[] n = bf.readLine().split(" ");
        String[] m = bf.readLine().split(" ");
//        没有Arrays combine函数
        StringBuilder sb = new StringBuilder("");
        int N = n.length;
        int M = m.length;
        int[] c = new int[m.length + n.length];
        for (int i = 0; i < N; i++){
            c[i] = Integer.parseInt(n[i]);
        }
        for (int i = 0; i < M; i++){
            c[i + N] = Integer.parseInt(m[i]);
        }
        Arrays.sort(c);
        for (int i = 0; i < M + N; i++){
            sb.append(c[i]).append(" ");
        }
        System.out.println(sb);
        sb.setLength(0);
//        以M中的元素插入N

    }
}
