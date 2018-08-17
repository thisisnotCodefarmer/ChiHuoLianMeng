package wh.daywork.aug.aug08;

import java.util.Scanner;

public class InsertDemo {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("请输入一串数字：");
        String nums=scanner.next();
        StringBuffer stringBuffer=new StringBuffer(nums);

        for (int i=stringBuffer.length()-3;i>0;i-=3){
            stringBuffer.insert(i,',');
        }
        System.out.println(stringBuffer);
    }
}
