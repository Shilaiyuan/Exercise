package Test9;
/**
 * 数组
 *
 * 1 数组存放同一类型数据
 * 2 简单数据类型(int,float)数组，可以直接赋值
 * 3 对象数组在定义后，赋值时需要再次为每个对象分配空间，即new 对象
 * 4 数组大小必须事先指定
 * 5 数组名可以理解为指向数组首地址的引用
 * 6 数组的下标是从0开始编号的
 * */
public class array {
    public static void main(String args[]) {
        Thread t=new Thread(){
            public void  run(){
                dianping();
            }
        };
        t.run();
        System.out.print("dazhong");
    }
    static void dianping(){
        System.out.print("dianping");
    }
}
