package wh.daywork.aug.aug05;

import wh.daywork.july.day21.Dog;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args){
        //创建四个狗狗对象
        Dog ououDog = new Dog("oo", "xuenarui");
        Dog yayaDog = new Dog("yaya", "labuladuo");
        Dog meimeiDog = new Dog("meimei", "xuenarui");
        Dog feifeiDog = new Dog("feifei", "labuladuo");

        Map<String ,Dog> dogMap=new HashMap<String,Dog>();
        dogMap.put(ououDog.getName(),ououDog);
        dogMap.put(yayaDog.getName(),yayaDog);
        dogMap.put(meimeiDog.getName(),meimeiDog);
        dogMap.put(feifeiDog.getName(),feifeiDog);

        Set<String> keys=dogMap.keySet();
        Iterator<String> it=keys.iterator();
        while(it.hasNext()){
            String key=it.next();
            Dog dog=dogMap.get(key);
            System.out.println(key+"\t"+dog.getStrain());
        }
        //foreach
//        for (String key:keys){
//            Dog dog=dogMap.get(key);
//            System.out.println(key+"\t"+dog.getStrain());
//        }

    }
}
