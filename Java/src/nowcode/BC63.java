package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC63 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while((str = br.readLine())!= null){
            int num = Integer.parseInt(str);
            StringBuffer sb = new StringBuffer();
//            打印正三角
            for(int i = 0; i <= num; i++){
                for(int j = 0; j <= num; j++){
                    if (j > (num - 1 - i)){
                        sb.append("* ");
                    }else {
                        sb.append(" ");
                    }
                }
                sb.append("\n");
            }
//            打印倒三角
            for(int i = 0; i < num; i++){
                for(int j = 0; j < i; j++){
                    sb.append(" ");
                }
                for (int j = 0; j< num - i; j++){
                    sb.append(" *");
                }
                sb.append("\n");
            }
            System.out.print(sb.toString());
        }
    }
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s;
//        StringBuilder sb = new StringBuilder();
//        while((s= br.readLine())!=null){
//            int n = Integer.parseInt(s);
//            for(int i =n;i>0;i--){
//                for(int j = i;j>0;j--){
//                    sb.append(' ');
//                }
//                for(int k = n-i;k>=0;k--)
//                    sb.append("* ");
//                sb.append("\n");
//            }
//            for(int i =0;i<=n;i++)
//                sb.append("* ");
//            sb.append("\n");
//            for(int i =n;i>0;i--){
//                for(int j =n-i;j>=0;j--){
//                    sb.append(' ');
//                }
//                for(int k = i;k>0;k--)
//                    sb.append("* ");
//                sb.append("\n");
//            }
//            System.out.print(sb);
//            sb.setLength(0);
//        }
//    }
}
