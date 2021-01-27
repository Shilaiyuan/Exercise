package Test7;

import java.util.Arrays;

/**
 * 二维数组
 *
 * */
public class twoDimensionalArrays {
    public static void main(String[] args){
//        声明数组
        int[][] nums;
        String names[][];

//        初始化数组
        nums = new int[3][2];


//        不规则数组
        int[][] c = new int[4][];
        c[0] = new int[3];
        c[1] = new int[1];
        c[2] = new int[4];
        c[3] = new int[3];

        int[][] d = {{1}, {2,3,1}, {5,2,1,7}, {6,1,7}};
        for(int i = 0; i<d.length ;i++){
            System.out.println(Arrays.toString(d[i]));
        }
    }


}
