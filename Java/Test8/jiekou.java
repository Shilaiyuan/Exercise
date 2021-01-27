package Test8;

interface usb{
    public void start();
    public void stop();
}
//实现接口
//当一个类实现接口就要求把该接口的所有方法通通实现
public class jiekou implements usb{
    @Override
    public void start() {
        System.out.println("开始工作");
    }

    @Override
    public void stop() {
        System.out.println("停止工作");
    }
}

//一个类可以说实现多个接口
//在接口中的变量都是static类型的

