package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BC45 {
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = input.readLine())!= null){
            String[] arr = str.split(" ");
            int[] scores = new int[3];
            for(int i = 0; i < 3; i++){
                scores[i] = Integer.parseInt(arr[i]);
            }
            Arrays.sort(scores);
            System.out.println(scores[2]);
        }
    }
}
