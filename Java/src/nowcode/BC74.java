package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC74 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = bf.readLine())!= null){
            int status = Integer.parseInt(str);
            switch (status){
                case 200:{
                    System.out.println("OK");
                    break; }
                case 202:{
                    System.out.println("Accepted");
                    break;
                }
                case 400:{
                    System.out.println("Bad Request");
                    break;
                }
                case 403:{
                    System.out.println("Forbidden");
                    break;
                }
                case 404:{
                    System.out.println("Not Found");
                    break;
                }
                case 500:{
                    System.out.println("Internal Server Error");
                    break;
                }
                case 502:{
                    System.out.println("Bad Gateway");
                    break;
                }
                default:break;
            }
        }
    }
}
