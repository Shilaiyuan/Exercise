package nowcode;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 判断输入字符串是否为字母
 * */
public class BC35 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = bf.readLine())!= null){
            char ch = str.charAt(0);
            if ((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
    }
}
