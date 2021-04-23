package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC97 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] str = bf.readLine().split(" ");
        int target = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (target < Integer.parseInt(str[i])) {
                sb.append(target).append(" ");
                target = Integer.parseInt(str[i]);
            } else {
                sb.append(str[i]).append(" ");
            }
        }
        sb.append(target);
        System.out.println(sb);
        sb.setLength(0);
    }
}