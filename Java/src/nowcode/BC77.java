package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC77 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[] str = bf.readLine().split(" ");
        int a = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++){
//            因为str是递增的，所以刚好插入到小于其后数字的前面
            if (a < Integer.parseInt(str[i])){
                sb.append(a).append(" ");
                a = Integer.parseInt(str[i]);
            }else {
                sb.append(str[i]).append(" ");
            }
        }
        sb.append(a);
        System.out.println(sb.toString().trim());
    }
}
