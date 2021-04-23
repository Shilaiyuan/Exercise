package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BC51 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while ((s = bf.readLine()) != null){
            String[] str = s.split(" ");
            int[ ] ang = new int[3];
            for (int i = 0; i < 3; i++){
                ang[i] = Integer.parseInt(str[i]);
            }
            Arrays.sort(ang);
            if (ang[0] + ang[1] <= ang[2] || ang[2] - ang[0] >= ang[1]){
                System.out.println("Not a triangle!");
            }else {
                int a = ang[0];
                int b = ang[1];
                int c = ang[2];
                if (a == b || a == c || b == c){
                    if (a == b && a == c){
                        System.out.println("Equilateral triangle!");
                    }else {
                        System.out.println("Isosceles triangle!");
                    }
                }else{
                    System.out.println("Ordinary triangle!");
                }
            }
        }
    }
}
