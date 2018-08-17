package wh.daywork.july.day11;

import java.util.Scanner;

public class Visitor {
    String name;
    int age;

    public void show() {
        Scanner input = new Scanner(System.in);
        while (!"n".equals(name)) {
            if (age >= 18 && age <= 60) {
                System.out.println(name + "的年龄为：" + age + ",票价为：20元\n");
            } else {
                System.out.println(name + "的年龄为：" + age + ",票价免费\n");
            }
            System.out.print("请输入姓名");
            name = input.next();

            if (!"n".equals(name)) {
                System.out.print("请输入年龄：");
                age = input.nextInt();
            }

        }
        System.out.print("退出程序");
    }
    public static  void main(String[]args){
        Scanner input=new Scanner(System.in);
        Visitor v=new Visitor();
        System.out.println("请输入姓名：");
        v.name=input.next();
        System.out.println("请输入年龄：");
        v.age=input.nextInt();
        v.show();
    }
}

