package wh.daywork.july.day06;

import java.util.Scanner;

public class Demo026 {
    public static void main(String[]args){
        int age=0;
        String sex="男";
        System.out.println("请输入年龄：");
        Scanner input=new Scanner(System.in);
        age=input.nextInt();
        System.out.println("请输入性别：");
        sex=input.next();
        if(age>7){
            System.out.println("可以搬动桌子");
        }else if (age==5&&sex.equals("男")){
            System.out.println("可以搬动桌子");
        }else {
            System.out.println("搬不动桌子！");
        }
    }
}
