package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 给定秒数seconds，把秒转化成小时，分钟和秒
 * */
public class BC23 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int sec = Integer.parseInt(input.readLine());
        int hour = sec/3600;
        int min = (sec%3600)/60;
        int loss = sec%60;
        System.out.println(hour + " " + min + " " + loss);
    }
}
