package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC93 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
        int posnum = 0;
        int nagnum = 0;
        for (int i = 0; i < s.length; i++){
            if (Integer.parseInt(s[i] ) > 0){
                posnum ++;
            }else if (Integer.parseInt(s[i]) < 0){
                nagnum ++;
            }else continue;
        }
        System.out.println("positive:" + posnum);
        System.out.println("negative:" + nagnum);
    }
}
