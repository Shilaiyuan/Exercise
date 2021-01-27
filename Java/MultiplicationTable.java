/**
 * 九九乘法表
 * */

public class MultiplicationTable {
    public static void main(String[] args){
        for (int i = 1; i <=9 ; i++){
            for(int j =1; j<=i ; j++){
                //设置左对齐,输出14位
                System.out.format("%-14s",j + " * " + i + " = " + j*i);
            }
            System.out.println();
        }
    }
}
