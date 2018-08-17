package wh.daywork.july.day24;
/**
*@Description:
 * 任务：1.定义一个猪类，一个狗类，每个类需要写3个以上的属性和方法，
 * 定义一个Animal类作为父类，优化整个类结构。
 * 画出类图，写出代码，并且使用super关键字，Override。
*/
 abstract class Animal{
    int age;
    String name;
    public Animal(int age,String name){
        this.age=age;
        this.name=name;
    }
    public void fight(String name){
        System.out.println(name+"会打架");
    }
/**

* @Description:    显示信息

* @Author:         wangheng

* @CreateDate:     2018/8/2 15:33

* @UpdateUser:     wangheng

* @UpdateDate:     2018/8/2 15:33

* @UpdateRemark:   修改内容

* @Version:        1.0

*/
public abstract void showInfo();
}

class Pig extends Animal{
     int weight;
     String color;
    Pig(String name,int age,int weight,String color){

        super(age,name);
        this.weight=weight;
        this.color=color;
    }
    public void eat(){
        System.out.println("我会吃饭");
    }
     @Override
    public void showInfo(){
         System.out.println("我是一只名字叫"+name
                             +"的猪，我今年"+age
                             + "岁了,我现在"+weight
                             +"斤了，"+"我是"+color+"的");
     }
}

class Dog extends Animal{
     char sex;
     String strain;
     Dog(String name,int age,char sex,String strain){
         super(age,name);
         this.sex=sex;
         this.strain=strain;

     }

     public void catchMouse(){
         System.out.println("我会逮耗子");
     }
    @Override
    public void showInfo(){
        System.out.println("我是一只名字叫"+name
                            +"的狗，我今年"+age
                            + "岁了,我是"+sex
                            +"的，"+"我是"+strain+"的");
    }
}

public class TestPigDog {
    public static void main(String[] args){
        Pig p=new Pig("abc",3,100,"黑色");
        Dog d=new  Dog("123",2,'公',"拉布拉多");

        p.showInfo();
        d.showInfo();
        p.eat();
        d.catchMouse();
    }
}
