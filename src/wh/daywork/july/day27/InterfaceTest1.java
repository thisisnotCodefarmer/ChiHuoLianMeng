package wh.daywork.july.day27;
interface A{
    public String AUHTOR="zhangsan";
    public void print();
    public String getInfo();
}
interface B{
    public void say();
}
class  X implements A,B {
    @Override
    public void say() {
        System.out.println(123);
    }

    @Override
    public String getInfo() {
        return "Heelo";
    }

    @Override
    public void print() {
        System.out.println("zuozhe:" + AUHTOR);
    }
}
public class InterfaceTest1{
        public static void main(String[] args){
         X x=new X();
         x.say();
         x.print();
        }
    }

