package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BC33 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        int[] scores = new int[str.length];
        double avg = 0.0;
        for (int i = 0; i<scores.length; i++){
            scores[i] = Integer.parseInt(str[i]);
        }
        avg = (double) Arrays.stream(scores).sum()/scores.length;
        System.out.println(String.format("%.1f",avg));
    }
}
