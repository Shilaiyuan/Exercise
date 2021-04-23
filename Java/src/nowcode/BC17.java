package nowcode;
//计算表达式的值
/*题目描述
        请计算表达式“(-8+22)×a-10+c÷2”，其中，a = 40，c = 212。
输入描述:
        无。
输出描述:
        (-8+22)×a-10+c÷2计算之后的结果，为一个整数。*/

public class BC17 {
    public static void main (String[] args){
        int a = 40, c=212;
        System.out.print((int)((-8) + 22) * a - 10 + c / 2);
    }
}
