package Test6;
/**
 * 方法的定义及调用
 * */
public class Means {
    public static void main(String[] args){
        /**
         * 调用方法sum
         * */
        sum();
    }
    /**
     * 定义无参数无返回值的方法sum
     * */
    private static void sum() {
        int sum = 0;
        for (int i = 1; i<100; i++){
            sum += i;
        }
        System.out.print(sum);
    }
}
