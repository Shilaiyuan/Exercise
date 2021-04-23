package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JZ12 {
    public double Power(double base, int exponent){
        if (base == 0.0 && exponent == 0)
            return 0;
        return Math.pow(base, exponent);
    }

    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(",");
        double a = Double.parseDouble(str[0]);
        int b = Integer.parseInt(str[1]);
        JZ12 sol = new JZ12();
        System.out.println(String.format("%.5f", sol.Power(a,b)));
    }
}
