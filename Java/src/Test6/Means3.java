package Test6;
/**
 * 方法的调用
 * */


public class Means3 {
    public static void main(String[] args){
        Means3 means = new Means3();
        means.M1();
        System.out.println(means.M2(8,5));
        System.out.println(Math.random()); //生成0-1之间的小数
    }
    /**
     * 同一个类中，直接使用 方法名() 调用
     * */
    public void M1(){
        System.out.println("方法调用");
    }
    /**
     * 不同类中，需要使用 类名.方法名()
     * */
    public int M2(int Num1, int Num2){
        return Math.max(Num1,Num2);
    }

}
