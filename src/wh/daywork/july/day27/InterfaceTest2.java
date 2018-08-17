package wh.daywork.july.day27;
/**
*@Description: 子类同时继承抽象类和实现接口
*/
interface C{
    public String name="lisi";
    public void print();
    public String getInfo();
}
abstract class D{
    public abstract void say();
}
class E extends D implements C{
    @Override
    public void say(){
        System.out.println("hello world");
    }
    @Override
    public String getInfo(){
        return "Hello";
    }
    @Override
    public void print(){
        System.out.println("zuozhe :"+name);
    }
}
public class InterfaceTest2 {
    public static void main(String[] args){
        E e =new E();
        e.say();
        e.print();
    }
}
