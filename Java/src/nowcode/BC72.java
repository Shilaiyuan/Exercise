package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC72 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        Double[] high = new Double[5];
        for (int i = 0; i < 5; i++){
            high[i] = Double.parseDouble(str[i]);
        }
        System.out.println(String.format("%.2f",(high[0] + high[1] + high[2] + high[3] + high[4])/5.0));
    }
}
