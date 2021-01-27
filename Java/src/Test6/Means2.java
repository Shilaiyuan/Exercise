package Test6;
/**
 * 定义参数有返回值
 *
 * */
public class Means2 {
    public static void main(String[] args){
        System.out.print(sum(3,5));//3,5为实参
    }

    public static int sum(int Num1, int Num2){//Num1和Num2即为形参
        int result;
        result = Num1 + Num2;
        return result;//有返回值的方法执行到return后就不再向下执行
    }
}
