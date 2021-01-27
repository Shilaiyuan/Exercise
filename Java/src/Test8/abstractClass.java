package Test8;

public class abstractClass {
    public static void main(String args){
//        抽象类不能被实例化，比如不能出现
//        Animal animal = new Animal();
    }
}
//abstract修饰一个类就是一个抽象类，修饰一个方法为抽象方法
abstract class Animal{
    String name;
    int age;
    abstract public void cry();
}
//继承了抽象类的类必须实现抽象类中定义的所有方法
class test extends Animal{
    public void cry(){
//        do nothing
    }
}