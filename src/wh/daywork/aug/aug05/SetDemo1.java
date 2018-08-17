package wh.daywork.aug.aug05;

import wh.daywork.july.day21.Dog;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args){

        //创建四个狗狗对象
        Dog ououDog = new Dog("oo", "xuenarui");
        Dog yayaDog = new Dog("yaya", "labuladuo");
        Dog meimeiDog = new Dog("meimei", "xuenarui");
        Dog feifeiDog = new Dog("feifei", "labuladuo");

        Set dogs=new HashSet();
        dogs.add(ououDog);
        dogs.add(yayaDog);
        dogs.add(meimeiDog);
        dogs.add(feifeiDog);

        System.out.println("you:"+dogs.size()+"gou");

        System.out.println("分别是");
        for (int i=0;i<dogs.size();i++){
//            Dog dog=(Dog)dogs.get(i);
        }
    }
}
