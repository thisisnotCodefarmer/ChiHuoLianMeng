package wh.daywork.aug.aug08;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class TimeDemo {
    public static void main(String[] args){
        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间"+format.format(date));
    }
}

class CalendarDemo{
    public static void main(String[] args){
        Calendar t=Calendar.getInstance();
        System.out.println("今天是："+t.get(Calendar.YEAR)+"年"+(t.get(Calendar.MONTH)+1)+"月"+t.get(Calendar.DAY_OF_MONTH));
        System.out.println("今天是星期"+(t.get(Calendar.DAY_OF_WEEK)-1));
    }
}

