package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC59 {
    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        String s = null;
//        while ((s = bf.readLine())!= null){
//            int a = Integer.parseInt(s);
//            for (int i = a; i > 0; i--){
//                for (int j = 0; j < i; j++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//        }
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=null;
        while((str=br.readLine())!=null){
            int num=Integer.parseInt(str);
            StringBuffer sb=new StringBuffer();
            for(int i=num;i>0;i--){
                for(int j=0;j<i;j++){
                    sb.append("* ");
                }
                sb.append("\n");
            }
            System.out.print(sb.toString());
        }
    }
}
