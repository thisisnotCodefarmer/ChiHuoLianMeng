package wh.testwork01;

import java.util.HashMap;
import java.util.Map;

public class Text11 {
    public static void main(String[] args){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"java");
        map.put(2,".net");
        map.put(4,"android");
        map.remove("android");
        for (Integer key:map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
