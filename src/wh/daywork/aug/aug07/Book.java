package wh.daywork.aug.aug07;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Book implements Comparable{
    Double price;
    String name;

    public Book( String name,double price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public int compareTo(Object b1){
        Book book=(Book)b1;
        return this.price.compareTo(book.price);
    }

public static void main(String[] args){
    List<Book> list=new LinkedList<Book>();
    list.add(new Book("Java基础教程",29.0));
    list.add(new Book("数据库技术",29.0));
    list.add(new Book("C++基础教程",29.0));
    list.add(new Book("数据结构",30.0));

    Book book=new Book("模式识别",29.0);
    System.out.println("新书：《"+book.name+"》与下列图书");

    Iterator<Book> it=list.iterator();

    while(it.hasNext()){
        Book boo=it.next();
        if(boo.price.compareTo(book.price)==0){
            System.out.println(boo.name);
        }
    }
    System.out.println("价格相同，具体价格为："+book.price);
    }
}
