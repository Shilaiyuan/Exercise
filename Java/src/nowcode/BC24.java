package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 依次输入一个学生的3科成绩，在屏幕上输出该学生的总成绩及平均成绩
 * */
public class BC24 {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] str = input.readLine().split(" ");
        double[] scores = new double[str.length];
        for (int i = 0; i<scores.length; i++){
            scores[i] = Double.valueOf(str[i]);
        }
        double add = Arrays.stream(scores).sum();
        System.out.printf("%.2f %.2f",add ,add/3);
//        79.5 80.0 98.0
    }
}
