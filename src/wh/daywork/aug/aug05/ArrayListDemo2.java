package wh.daywork.aug.aug05;

import wh.daywork.july.day21.Dog;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args){
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

        //删除前集合中狗狗的数量
        System.out.println("删除之前共计有："+dogs.size()+"条狗狗。");

        //删除第一个狗和feifei狗
        dogs.remove(0);
        dogs.remove(feifeiDog);

        //显示删除后各条狗狗的信息
        System.out.println("删除之后还有："+dogs.size()+"条狗狗。");
        System.out.println("分别是：");
        for (int i=0;i<dogs.size();i++){
            Dog dog=(Dog)dogs.get(i);
            System.out.println(dog.getName()+"\t"+dog.getStrain());
        }

        //判断集合中是否包含指定狗狗的信息
        if (dogs.contains(meimeiDog)){
            System.out.println("集合中包含美美的信息");
        }else {
            System.out.println("集合中包含美美的信息");
        }
    }
}
