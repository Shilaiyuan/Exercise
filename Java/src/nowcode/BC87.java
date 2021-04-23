package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BC87 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] str = bf.readLine().split(" ");
        Double[] scores = new Double[n];
        double sum = 0.0;
        for (int i = 0; i < n; i++){
            scores[i] = Double.parseDouble(str[i]);
            sum += scores[i];
        }
        Arrays.sort(scores);
        System.out.println(String.format("%.2f %.2f %.2f", scores[n-1], scores[0], (sum/n)));
    }
}
