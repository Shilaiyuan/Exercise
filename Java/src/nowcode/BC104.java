package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC104 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
//        行坐标
        int xIndex = 0;

        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
//        列坐标集
        int[] yIndex = new int[x];
        int yindex = 0;
//        存储每排最大值
        int[] max = new int[x];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x; i++){
            String[] arr = bf.readLine().split(" ");
            int target = Integer.parseInt(arr[0]);
            max[i] = target;
            yIndex[i] = 0;
            for (int j = 1; j < y; j++){
                if (target > Integer.parseInt(arr[j])){
                    ;
                }else {
                    target = Integer.parseInt(arr[j]);
                    max[i] = target;
                    yIndex[i] = j;
                }
            }
        }
        int target = max[0];
        yindex = yIndex[0];
        for (int i = 1; i < max.length; i++){
            if (target >= max[i]){
                continue;
            }else {
                target = max[i];
                xIndex = i;
                yindex = yIndex[i];
            }
        }
        sb.append(xIndex + 1).append(" ");
        sb.append(yindex + 1).append(" ");
        System.out.print(sb);
        sb.setLength(0);
    }
}
