package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 井字棋
 * */
public class BC110 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[][] chees = new char[3][3];
        for (int i = 0; i < 3; i++){
            String[] s = bf.readLine().split(" ");
            for(int j = 0; j < 3; j++){
                chees[i][j] = s[j].charAt(0);
            }

        }
        boolean Kwin = cheakWiner(chees,'K');
        boolean Bwin = cheakWiner(chees, 'B');
        if(Kwin ==true) {
            System.out.println("KiKi wins!");
        }else if (Bwin == true){
            System.out.println("BoBo wins!");
        }else {
            System.out.println("No winner!");
        }

    }

//    检测字符对应棋子是否获胜
    static boolean cheakWiner(char[][] ch, char c){
//        三行三列棋盘中,进入对角线判定的条件是占据棋盘中央
        if (ch[1][1] == c){
            if (ch[0][0] == c && ch[2][2] == c){
                return true;
            }
            if (ch[0][2] == c && ch[2][0] == c){
                return true;
            }
            if (ch[0][1] == c && ch[2][1] == c){
                return true;
            }
            if (ch[1][0] == c && ch[1][2] == c){
                return true;
            }
        }
//        竖
        if (ch[0][0] == c && ch[1][0] == c && ch[2][0] == c){
            return true;
        }
        if (ch[0][2] == c && ch[1][2] == c && ch[2][2] == c){
            return true;
        }
//        横
        if (ch[0][0] == c && ch[0][1] == c && ch[0][2] == c){
            return true;
        }
        if (ch[2][0] == c && ch[2][1] == c && ch[2][2] == c){
            return true;
        }
        return false;
    }
}
