package wh.daywork.july.day05;

import java.util.Scanner;



public class LoadInf {
    public  static void p(Object o){
        System.out.print(o);
    }
    public  static void pln(Object o){
        System.out.println(o);
    }


    public static void main(String[]args){
        String name;
        String password;
        int degree=0;
        Scanner input=new Scanner(System.in);
        for (int i=3;i>0;i++){

            pln("请输入用户名：");
            name=input.next();
            pln("请输入密码");
            password=input.next();
            if (name.equals("jim")&&(password.equals("123456"))){
               p("欢迎登录MyShopping系统！");
                break;
            }else {
                 pln("输入错误！你还有" + (i-1) + "次机会\n");
            }
            if (i==1){
                pln("输入结束！");
            }
        }

    }
}
