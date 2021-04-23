package Test6;

import java.util.Scanner;

/**
 * @Author：Shilaiyuan
 * @Date:2020-10-29
 * @Description:猜数字游戏,生成[0,100]之间的随机数，用户猜生成的数字，返回猜大猜小和猜对时的次数
 * @Email:imShilaiyuan@qq.com
 * */
public class NumRiddle {
    static int count;
    static int KeyNum;
    static boolean ComplexFlag;

    public static void main(String[] args){
        NumRiddle NR = new NumRiddle();
        while (true){
            count = 0;
            KeyNum = (int)(Math.random()*101);
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入您猜的数字：");
            while (true){
                count ++;
                String str = scanner.next();
                //防止不规范输入
                ComplexFlag = false;
                for (int i = str.length(); --i>=0 ; ){
                    int chr = str.charAt(i);
                    if(chr < 48 || chr > 57){
                        System.out.println("请输入整数！");
                        count = 0 ;
                        ComplexFlag = true;
                        break;
                    }
                }
                if (ComplexFlag) continue;
                int InputNum = Integer.parseInt(str);
                if (InputNum < 0 ||InputNum > 100){
                    System.out.println("请输入[0,100]之间的数！");
                    count = 0 ;
                    break;
                }


                if(NR.NumCompare(KeyNum, InputNum)){
                    System.out.println("恭喜你，猜对了！  " + "一共运行了" + count + "次");
                    count = 0 ;
                    break;
                }else if (NR.BigFlag(KeyNum,InputNum)){
                    System.out.println("猜小了");
                }else {
                    System.out.println("猜大了");
                }
            }
        }
    }

    /**
     * @Information:NumCompare比较两数是否相同
     * @return :boolean
     * */
    public boolean NumCompare(int Num1, int Num2){
        boolean result = false;
        if (Num1 == Num2)
            result = true;
        return result;
    }

    /**
     * @Information:BigFlag返回是否比原数大的结果
     * @return :boolean
     * */
    public boolean BigFlag(int Num1, int Num2){
        boolean result = false;
        if (Num1 > Num2) //
            result = true;
        return result;
    }
}
