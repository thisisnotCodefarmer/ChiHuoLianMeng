package wh.daywork.aug.aug05;

import wh.daywork.july.day21.Dog;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args){
        //创建四个狗狗对象
        Dog ououDog = new Dog("oo", "xuenarui");
        Dog yayaDog = new Dog("yaya", "labuladuo");
        Dog meimeiDog = new Dog("meimei", "xuenarui");
        Dog feifeiDog = new Dog("feifei", "labuladuo");

        List<Dog> dogs=new ArrayList<Dog>();
        dogs.add(ououDog);
        dogs.add(yayaDog);
        dogs.add(meimeiDog);
        dogs.add(2,feifeiDog);

//        dogs.add("hello");
        Dog dog3=dogs.get(2);
        System.out.println("第三个狗信息如下：");
        System.out.println(dog3.getName()+"\t"+dog3.getStrain());

        System.out.println("所有狗信息如下：");
        for (Dog   dog:dogs){
            System.out.println(dog.getName()+"  "+dog.getStrain());
        }
    }

}
