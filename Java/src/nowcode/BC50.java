package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC50 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while ((s = bf.readLine()) != null){
            int t = Integer.parseInt(s);
//            分段函数
            if (t < 0) System.out.println(0);
            if (t == 0) System.out.println(0.5);
            if (t > 0) System.out.println(1);
        }
    }
}
