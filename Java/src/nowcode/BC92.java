package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC92 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        此处卜可以用reverse
        String[] s = bf.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = s.length-1; i >= 0; i--){
            sb.append(s[i] + " ");
        }
        System.out.println(sb);
        sb.setLength(0);
    }
}
