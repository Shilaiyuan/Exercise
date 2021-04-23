package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BC39 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
//        判断回车
        while ((str = bf.readLine()) != null){
            int num = Integer.parseInt(str);
            String[] scores = bf.readLine().split(" ");
            int[] grades = new int[num];
            for (int i = 0; i < num; i++){
                grades[i] = Integer.parseInt(scores[i]);
            }
//            无须考虑数组连续性，直接使用sort
            Arrays.sort(grades);
            for (int i = num-1; i >= num-5; i--){
                System.out.print(grades[i] + " ");
            }
        }

    }
}
