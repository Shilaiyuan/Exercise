package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC30 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        int[] in = new int[str.length];
        int left = 0;
        for (int i = 0; i<in.length; i++){
            in[i] = Integer.parseInt(str[i]);
        }
//        经过的时间恰好被喝酸奶的速度整除，此时还未打开下一瓶酸奶
        if (in[2]%in[1] == 0)
            left = in[0] - in[2]/in[1];
        else
            left = in[0] - in[2]/in[1] - 1;
        System.out.println(left);
    }
}
