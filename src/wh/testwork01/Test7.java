package wh.testwork01;

import java.util.*;

public class Test7{
    public static void main(String[] args){
        Map m2=new TreeMap();
        m2.put("101","123");
        m2.put("102","4");
        m2.put("103","5");
        Collection c=m2.keySet();
        Iterator it=c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}

