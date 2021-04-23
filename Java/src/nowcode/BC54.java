package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 获得月份天数
 * */
public class BC54 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while ((s = bf.readLine()) != null){
            String[] str = s.split(" ");
            int[] input = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                input[i] = Integer.parseInt(str[i]);
            }
            int year = input[0];
            int month = input[1];
            switch (month){
                case 1:
                case 12 :
                case 10 :
                case 3 :
                case 5:
                case 7 :
                case 8 : {
                    System.out.println(31);break;
                }
                case 2:{
                    if (year%400 == 0 ||year%4 == 0)
                        System.out.println(29);
                    else System.out.println(28);break;
                }
                case 4 :
                case 6:
                case 9:
                case 11 : {
                    System.out.println(30);break;
                }
                default:
            }
        }
    }
}
