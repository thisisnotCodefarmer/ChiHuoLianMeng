package wh.daywork.july.day27;

interface Fruit{
    public void eat();
}
class Apple implements Fruit{
    @Override
    public void eat(){
        System.out.println("吃苹果");
    }
};
class Orange implements Fruit{
    @Override
    public void eat(){
        System.out.println("吃橘子");
    }
};
class Factory{
    public static Fruit getInsatnce(String className){
        Fruit f=null;
        if("apple".equals(className)){
            f=new Apple();
        }
        if("orange".equals(className)){
            f=new Orange();
        }
        return f;
    }
}
public class InterfaceCaseDemo04 {
    public static void main(String[] args){
     Fruit f=null;
     f=Factory.getInsatnce(args[0]);
     if(f!=null){
     f.eat();
     }
    }
}

