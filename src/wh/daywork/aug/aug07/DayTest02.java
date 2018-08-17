package wh.daywork.aug.aug07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static jdk.nashorn.internal.objects.Global.print;


public class DayTest02 {
//    public static void main(String[] args){
//        List list=new ArrayList();
//        list.add("A");
//        list.add(1,"B");
//        String s=(String)list.get(1);
//        System.out.println(s);
//    }
}
//class Test{
//    public static void main(String[] args){
//        Map map=new HashMap();
//        String s="key";
//        map.put(s,"hello");
//        map.put(s,"worls");
//        System.out.println(map.size());
//    }
//}
class Test1{
    public static void main(String[] args){
        List list=new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        print(list);
    }
    public static void print(List pList){
        for (int i=0;i<pList.size();i++){
            List str =(List)pList.get(i);
            System.out.println(str);
        }
    }
}