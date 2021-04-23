import java.util.Scanner;

/**
 * 控制台输出直角三角形
 * */

public class PrintTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入行数：");
        int rows = input.nextInt();


        for(int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
