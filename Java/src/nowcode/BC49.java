package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC49 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        String[] str = bf.readLine().split(" ");
        String s = null;
        while ((s = bf.readLine())!= null){
            String[] str = s.split(" ");
            int[] input = new int[2];
            for (int i = 0; i < 2; i++){
                input[i] = Integer.parseInt(str[i]);
            }
            if (input[0] > input[1]) System.out.println(input[0] + ">" + input[1]);
            if (input[0] < input[1]) System.out.println(input[0] + "<" + input[1]);
            if (input[0] == input[1]) System.out.println(input[0] + "=" + input[1]);
        }
    }

}
