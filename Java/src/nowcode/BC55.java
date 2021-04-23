package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 获得月份天数
 * */
public class BC55 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while ((s = bf.readLine()) != null){
            String[] str = s.split("[+\\-*/]");
            if (str.length < 2){
                System.out.println("Invalid operation!");
            }else {
                Double a = Double.parseDouble(str[0]);
                Double b = Double.parseDouble(str[1]);
//                获取输入一组字符串的符号
                char target = s.charAt(str[0].length());
                switch (target){
                    case '+':
                        System.out.println(String.format("%.4f+%.4f=%.4f", a, b, (a + b)));break;
                    case '-':
                        System.out.println(String.format("%.4f-%.4f=%.4f", a, b, (a - b)));break;
                    case '*':
                        System.out.println(String.format("%.4f*%.4f=%.4f", a, b, (a * b)));break;
                    case '/':
                        if (b == 0){
                            System.out.println("Wrong!Division by zero!");break;
                        }else {
                            System.out.println(String.format("%.4f/%.4f=%.4f", a, b, (a / b)));break;
                        }
                    default:break;
                }
            }
        }
    }
}