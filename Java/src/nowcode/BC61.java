package nowcode;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC61 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while((str = br.readLine())!= null){
            int num = Integer.parseInt(str);
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < num; i++){
                for(int j = 0; j < num; j++){
                    if (j >= (num - 1 - i)){
                        sb.append("* ");
                    }else {
                        sb.append(" ");
                    }
                }
                sb.append("\n");
            }
            System.out.print(sb.toString());
        }
    }
}
