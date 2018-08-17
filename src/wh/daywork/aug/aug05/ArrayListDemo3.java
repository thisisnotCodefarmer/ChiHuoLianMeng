package wh.daywork.aug.aug05;

import wh.daywork.july.day21.Dog;

import java.util.LinkedList;


public class ArrayListDemo3 {
    public static void main(String[] args){
        //创建四个狗狗对象
        Dog ououDog = new Dog("oo", "xuenarui");
        Dog yayaDog = new Dog("yaya", "labuladuo");
        Dog meimeiDog = new Dog("meimei", "xuenarui");
        Dog feifeiDog = new Dog("feifei", "labuladuo");

        //创建LinkedList集合对象并把4个狗狗对象放入其中
        LinkedList dogs = new LinkedList();
        dogs.add(ououDog);
        dogs.add(yayaDog);
        dogs.addLast(meimeiDog);
        dogs.addFirst(feifeiDog);

        //查看集合第一条狗狗的信息
        Dog dogFirst=(Dog)dogs.getFirst();
        System.out.println("第一条狗是："+dogFirst.getName());

        //查看集合最后一条狗狗的信息
        Dog dogLast=(Dog)dogs.getLast();
        System.out.println("最后一条狗是："+dogLast.getName());

        //删除集合第一条狗狗和最后一条狗狗
        dogs.removeFirst();
        dogs.removeLast();

        //显示删除后狗狗的信息
        System.out.println("删除后狗狗还有："+dogs.size()+"条狗狗。");
        System.out.println("分别是");
        for (int i=0;i<dogs.size();i++){
            Dog dog=(Dog)dogs.get(i);
            System.out.println(dog.getName()+"\t"+dog.getStrain());
        }
    }
}
