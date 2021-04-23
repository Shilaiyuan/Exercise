package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BC96 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[] str = bf.readLine().split(" ");
        boolean flag = true;
        for (int i = 1; i < N; i++){
            if (Integer.parseInt(str[i]) >= Integer.parseInt(str[i-1]))
                continue;
            else flag = false;
        }
//        判断递减
        if (flag == false){
            for (int i = 1; i < N; i++){
                if (Integer.parseInt(str[i]) < Integer.parseInt(str[i-1])){
                    if (i == N - 1) flag = true;
                    continue;
                } else break;
            }
        }
        if (flag){
            System.out.println("sorted");
        }else {
            System.out.println("unsorted");
        }
    }
}