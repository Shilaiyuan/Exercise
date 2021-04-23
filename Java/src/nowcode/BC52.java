package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC52 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while ((s = bf.readLine()) != null) {
            String[] str = s.split(" ");
            int[] body = new int[2];
            for (int i = 0; i < 2; i++) {
                body[i] = Integer.parseInt(str[i]);
            }
            double BMI = (double) body[0] / ((double) body[1] * (double) body[1] / 10000);
            if (BMI < 18.5) System.out.println("Underweight");
            if (BMI >= 18.5 && BMI <= 23.9) System.out.println("Normal");
            if (BMI > 23.9 && BMI <= 27.9) System.out.println("Overweight");
            if (BMI > 27.9) System.out.println("Obese");
        }
    }
}
