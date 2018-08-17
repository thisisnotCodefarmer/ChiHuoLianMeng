package wh.daywork.aug.aug07;

import java.util.HashMap;
import java.util.Map;



class HashMapDemo{
    public static void main(String[] args) throws Exception {
        Map<String, Integer> map = new HashMap<String,Integer>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("zero",null);
        System.out.println(map.get("zero"));
        System.out.println(map.get(null));
        System.out.println(map.get("one"));
    }
}
