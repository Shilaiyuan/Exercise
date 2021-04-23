package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 矩阵变换操作
 * */

public class BC108 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] a = bf.readLine().split(" ");
        int x = Integer.parseInt(a[0]);
        int y = Integer.parseInt(a[1]);
        int[][] org = new int[x][y];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x; i++){
            String[] str = bf.readLine().split(" ");
            for (int j = 0; j < y; j++){
                org[i][j] = Integer.parseInt(str[j]);
            }
        }
        int k = Integer.parseInt(bf.readLine());
        for (int n = 0; n < k; n++){
            int target;
            String[] op = bf.readLine().split(" ");
            if (op[0].charAt(0) == 'r'){
//            行变换
                int x1 = Integer.parseInt(op[1]) -1;
                int x2 = Integer.parseInt(op[2]) -1;
                for (int i = 0; i < x; i++){
//                     if (i == x1){
//                         for (int j = 0; j < y; j++){
//                             sb.append(org[x2][j]).append(" ");
//                             if (j == y -1) sb.append("\n");
//                         }
//                         continue;
//                     }
//                     if (i == x2){
//                         for (int j = 0; j < y; j++){
//                             sb.append(org[x1][j]).append(" ");
//                             if (j == y -1) sb.append("\n");
//                         }
//                         continue;
//                     }
//                     for (int j = 0; j < y; j++){
//                         sb.append(org[i][j]).append(" ");
//                         if (j == y -1) sb.append("\n");
//                     }
                    target = org[x1][i];
                    org[x1][i] = org[x2][i];
                    org[x2][i] = target;
                }
            }else if (op[0].charAt(0) == 'c'){
//            列变换
                int y1 = Integer.parseInt(op[1]) -1;
                int y2 = Integer.parseInt(op[2]) -1;
                for (int i = 0; i < y; i++){
//                     if (i == y1){
//                         for (int j = 0; j < x; j++){
//                             sb.append(org[j][y2]).append(" ");
//                             if (j == x -1) sb.append("\n");
//                         }
//                         continue;
//                     }
//                     if (i == y2){
//                         for (int j = 0; j < x; j++){
//                             sb.append(org[j][y1]).append(" ");
//                             if (j == x -1) sb.append("\n");
//                         }
//                         continue;
//                     }
//                     for (int j = 0; j < x; j++){
//                         sb.append(org[j][i]).append(" ");
//                         if (j == x -1) sb.append("\n");
//                     }
                    target = org[i][y2];
                    org[i][y2] = org[i][y1];
                    org[i][y1] = target;
                }
            }
            for(int i = 0; i < x; i++){
                for(int j = 0; j < y; j++){
                    sb.append(org[i][j]).append(" ");
                }
                sb.append("\n");
            }
            System.out.print(sb.toString());
//            sb.setLength(0);
        }
    }
}
