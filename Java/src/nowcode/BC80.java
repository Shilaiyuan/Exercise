package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC80 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while ((s = bf.readLine())!= null){
            String[] str = s.split(" ");
            if (str[0].equals("admin")){
                if (str[1].equals("admin")){
                    System.out.println("Login Success!");
                }else {
                    System.out.println("Login Fail!");
                }
            }else {
                System.out.println("Login Fail!");
            }
        }

    }
}
