package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 图像相似度
 *
 * */
public class BC79 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        int[] arr = new int[2*x*y];
        int index = 0;
        for (int i = 0; i < 2*x; i++) {
            String nums = bf.readLine();
            String[] numArray = nums.split(" ");
            for (String s1 : numArray) {
                arr[index] = Integer.parseInt(s1);
                index++;
            }
        }
        int count = 0;
        for (int i = 0; i < x*y; i++) {
            if(arr[i]==arr[i+x*y]){
                count++;
            }
        }
        System.out.printf("%.2f",count*100f/x/y);
    }
}
