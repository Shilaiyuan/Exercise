package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 买衣服，双十一七折，双十二八折，优惠券减50元
 * */
public class BC37 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str =bf.readLine().split(" ");
        //原价
        double price = 0.0;
        //日期
        int[] data = new int[2];
        //优惠券
        boolean barget = false;
        price = Double.parseDouble(str[0]);
        data[0] = Integer.parseInt(str[1]);
        data[1] = Integer.parseInt(str[2]);
        if (price <= 0) price = 0.0;
        //判断是否在节日
        if (data[0] == 11 && data[1] == 11){
            barget = Integer.parseInt(str[3]) == 1? true : false;
            double sale;
            if (barget){
                sale = price * 0.7 - 50;
                sale = sale >= 0 ? sale : 0.00;
                System.out.println(String.format("%.2f", sale));
            }else {
                sale = price * 0.7;
                sale = sale >= 0 ? sale : 0.00;
                System.out.println(String.format("%.2f",sale));
            }
        }else if (data[0] == 12 && data[1] == 12){
            barget = Integer.parseInt(str[3]) == 1? true : false;
            double sale;
            if (barget){
                sale = price * 0.8 - 50;
                sale = sale >= 0 ? sale : 0.00;
                System.out.println(String.format("%.2f", sale));
            }else {
                sale = price * 0.8;
                sale = sale >= 0 ? sale : 0.00;
                System.out.println(String.format("%.2f", sale));
            }
        }else {
            System.out.println(String.format("%.2f", price));
        }
    }
}
