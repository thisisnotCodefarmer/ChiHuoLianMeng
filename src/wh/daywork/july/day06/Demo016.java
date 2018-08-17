package wh.daywork.july.day06;

import java.util.Scanner;

public class Demo016 {
    public static void main(String[]args){
         String name="青";
        int password=123;

        System.out.println("请输入用户名：");
        Scanner input=new Scanner(System.in);
        name=input.next();
        System.out.println("请输入密码：");
       password=input.nextInt();

       if (name.equals("青")&&(password==123))
       {
           System.out.println("欢迎你，青");
       }else {
           System.out.println("对不起， 你不是青");
       }

    }
}
