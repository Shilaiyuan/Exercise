package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BC76 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        int[] scores = new int[str.length];
        for (int i = 0; i < str.length; i++){
            scores[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(scores);
        int l = scores.length - 2;
        int sum = 0;
        double avg = 0.0;
        for (int i = 1; i < scores.length-1; i++){
            sum = sum + scores[i];
        }
        avg = (double) sum / (double) l;
        System.out.println(String.format("%.2f",avg));
    }
}
