package wh.daywork.july.day23;

abstract class Animal{

    int age;

public abstract void info();

}

class Bird extends Animal{
    private String color;
    Bird(int age,String color){
        super.age=age;
        this.color=color;
    }
    @Override
    public  void info(){
        System.out.println("我是一只"+color+"的鸟");
        System.out.println("今年"+age+"岁了");
    }
}

class Fish extends Animal {
    private int weight;

    public Fish(int age, int weight) {
        super.age=age;
        this.weight=weight;
    }

    @Override
    public  void info(){
        System.out.println("我是一只"+weight+"斤重的鱼");
        System.out.println("今年"+this.age+"岁了");
    }
}
public class TestAnimal {
    public static void main(String[] args){
        Bird b=new Bird(4,"红色");
        Fish f=new Fish(2,5);
        b.info();
        f.info();
    }
}

