package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 给定球体半径，计算其体积
 * */
public class BC27 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        double ret = Double.parseDouble(str);
        double PI = 3.1415926;
        System.out.printf(String.format("%.3f",4*PI*(ret*ret*ret)/3));
    }
}
