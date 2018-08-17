package wh.daywork.aug.aug05;

import wh.daywork.july.day21.Dog;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        //创建四个狗狗对象
        Dog ououDog = new Dog("oo", "xuenarui");
        Dog yayaDog = new Dog("yaya", "labuladuo");
        Dog meimeiDog = new Dog("meimei", "xuenarui");
        Dog feifeiDog = new Dog("feifei", "labuladuo");

        //创建ArrayList集合对象并把4个狗狗对象放入其中
        List dogs = new ArrayList();
        dogs.add(ououDog);
        dogs.add(yayaDog);
        dogs.add(meimeiDog);
        dogs.add(2, feifeiDog);

        System.out.println("共计有："+dogs.size()+"条狗狗。");

        System.out.println("分别是：");
        for (int i=0;i<dogs.size();i++){
            Dog dog=(Dog)dogs.get(i);
            System.out.println(dog.getName()+"\t"+dog.getStrain());
        }

    }

}
