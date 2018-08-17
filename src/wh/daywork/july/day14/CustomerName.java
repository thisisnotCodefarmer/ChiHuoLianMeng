package wh.daywork.july.day14;

import java.util.ArrayList;
import java.util.List;


public class CustomerName {
    List list=new ArrayList();

    public void addName(String name){

        list.add(name);
    }
    public void showNames() {
       System.out.println(list);
    }

}
