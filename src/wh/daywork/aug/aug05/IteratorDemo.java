package wh.daywork.aug.aug05;


import wh.daywork.july.day21.Dog;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorDemo {
    public static void main(String[] args) {
        //创建四个狗狗对象
        Dog ououDog = new Dog("oo", "xuenarui");
        Dog yayaDog = new Dog("yaya", "labuladuo");
        Dog meimeiDog = new Dog("meimei", "xuenarui");
        Dog feifeiDog = new Dog("feifei", "labuladuo");

        Map dogMap=new HashMap();
        dogMap.put(ououDog.getName(),ououDog);
        dogMap.put(yayaDog.getName(),yayaDog);
        dogMap.put(meimeiDog.getName(),meimeiDog);
        dogMap.put(feifeiDog.getName(),feifeiDog);

        System.out.println("Iterator遍历"+"所有狗狗是：");
        Set keys=dogMap.keySet();
        Iterator it=keys.iterator();
        while(it.hasNext()){
            String key=(String)it.next();
            Dog dog=(Dog)dogMap.get(key);
            System.out.println(key+"\t"+dog.getStrain());
        }

        //使用foreach 遍历
        System.out.println("所有狗狗：");
        Set keyss=dogMap.keySet();
        for (Object key:keys){
            Dog dog=(Dog) dogMap.get(key);
            System.out.println(key+"\t"+dog.getStrain());
        }
    }
}
