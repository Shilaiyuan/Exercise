package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC82 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        int[] input = new int[str.length];
        for (int i = 0; i < str.length; i++){
            input[i] = Integer.parseInt(str[i]);
        }
        System.out.println((input[0] + input[1] - input[2])*input[3]);
    }
}
