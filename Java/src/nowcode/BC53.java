package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC53 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while ((s = bf.readLine()) != null){
            String[] str = s.split(" ");
            Double[]  coefficient= new Double[3];
            for (int i = 0; i < 3; i++){
                coefficient[i] = Double.parseDouble(str[i]);
            }
            double a = coefficient[0];
            double b = coefficient[1];
            double c = coefficient[2];
            if (a == 0){
                System.out.println("Not quadratic equation");
            }else {
                double drta = Math.pow(b ,2) - 4*a*c;
                double root1, root2;
                if (drta > 0){
//                    韦达定理
                    root1 =(-b - Math.sqrt(drta)) /(2*a);
                    root2 =(-b + Math.sqrt(drta)) /(2*a);
                    System.out.println("x1=" + String.format("%.2f" ,root1) +";x2=" + String.format("%.2f", root2));
                }else if (drta < 0){
                    double real = (- b)/ (2*a);
                    double img = Math.sqrt(- drta)/ (2*a);
                    System.out.println("x1=" + String.format("%.2f-%.2fi",real,img) + ";x2=" + String.format("%.2f+%.2fi",real,img));
                }else {
                    root2 =(-b + Math.sqrt(drta)) /(2*a);
                    System.out.println("x1=x2=" + String.format("%.2f", root2));
                }
            }
        }
    }
}
