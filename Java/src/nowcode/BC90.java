package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC90 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        int m = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);
        int sum = 0;
        for (int i = 0; i < m; i++){
            String[] arr = bf.readLine().split(" ");
            for(int j = 0; j < n; j++){
                if (Integer.parseInt(arr[j]) > 0) sum = sum + Integer.parseInt(arr[j]);
            }
        }
        System.out.println(sum);
    }
}
