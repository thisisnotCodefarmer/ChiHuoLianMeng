package wh.daywork.aug.aug07;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args){
        List<String> all=new ArrayList<String>();
        all.add("hello");
        all.add("world");
        all.add("wudi");
        ListIterator<String> iter=all.listIterator();
        System.out.println("由前向后输出：");
        while(iter.hasNext()){
            System.out.println(iter.next()+"、");
        }
        System.out.println("由后向前输出：");
        while(iter.hasPrevious()){
            System.out.println(iter.previous()+"、");
        }
    }
}
