package wh.testwork01;

import java.util.ArrayList;
import java.util.List;

public class Test8 {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(3);
        for(Integer i:list){
            System.out.println(i);
        }
    }
}
