package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC105 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] status = bf.readLine().split(" ");
        boolean flag = true;

        int [][] num1 = new int[Integer.parseInt(status[0])][Integer.parseInt(status[1])];
        int [][] num2 = new int[Integer.parseInt(status[0])][Integer.parseInt(status[1])];


        for(int i=0;i<Integer.parseInt(status[0]);i++){
            String [] str = bf.readLine().split(" ");
            for(int j = 0;j < Integer.parseInt(status[1]);j++){
                num1[i][j] = Integer.parseInt(str[j]);
            }
        }
        for(int i=0;i<Integer.parseInt(status[0]);i++){
            String [] str = bf.readLine().split(" ");
            for(int j = 0;j<Integer.parseInt(status[1]);j++){
                num2[i][j] = Integer.parseInt(str[j]);
            }
        }
        for(int i=0;i<Integer.parseInt(status[0]);i++){
            for(int j = 0;j<Integer.parseInt(status[1]);j++){
                if(num1[i][j] != num2[i][j]){
                    flag = false;
                    break;
                }
            }
        }
        if(flag == true){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
