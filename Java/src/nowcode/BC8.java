package nowcode;
//成绩输入输出
/*题目描述
        输入3科成绩，然后把三科成绩输出，成绩为整数形式。
输入描述:
        一行，3科成绩，用空格分隔，范围（0~100）。
输出描述:
        一行，把3科成绩显示出来，输出格式详见输出样例。
示例1
     输入
        60 80 90
     输出
        score1=60,score2=80,score3=90*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//public class BC8 {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        String str = input.nextLine();
//        String[] arr = str.split(" ");
//        int[] scores = new int[arr.length];
//        for(int i = 0; i < arr.length; i++){
//            scores[i] = Integer.parseInt(arr[i]);
//        }
//        for(int j = 0; j<arr.length; j++){
//            int m = j + 1;
//            System.out.print("score" + m + "=" + scores[j]);
//            if(j == 2)
//                break;
//            else
//                System.out.print(",");
//        }
//    }
//}
public class BC8{
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        System.out.println("score1=" + str[0] + ".score2=" + str[1] + ",score3="  + str[2]);
    }
}