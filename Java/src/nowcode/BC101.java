package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC101 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            String[] scores = bf.readLine().split(" ");
            Double[] output = new Double[scores.length];
            for (int j = 0; j < scores.length; j++){
                output[j] = Double.parseDouble(scores[j]);
            }
            double sum = output[0] + output[1] + output[2] + output[3] + output[4];
            System.out.println(String.format("%.1f %.1f %.1f %.1f %.1f %.1f", output[0], output[1], output[2], output[3], output[4], sum));
        }
    }
}
