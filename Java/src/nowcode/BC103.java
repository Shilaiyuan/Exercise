package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC103 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        int m = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);
        String[] arr = bf.readLine().split(" ");
        for (int i = 0; i < arr.length; i++){
            if((i + 1)%n == 0){
                System.out.println(arr[i] + " ");
            }else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
