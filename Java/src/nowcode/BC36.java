package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 输入体重，身高，根据BMI判断身体是否正常
 * */
public class BC36 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        double[] input = new double[str.length];
        for(int i = 0; i< str.length; i++){
            input[i] = Double.parseDouble(str[i]);
        }
        double BMI = input[0]/(input[1] * input[1]);
        if (BMI > 18.5 && BMI < 23.9){
            System.out.println("Normal");
        }else{
            System.out.println("Abnormal");
        }
    }
}
