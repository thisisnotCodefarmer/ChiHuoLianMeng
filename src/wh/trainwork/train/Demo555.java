package wh.trainwork.train;

import java.util.Scanner;

public class Demo555 {
   public static   void main(String[]args){
       Scanner input=new Scanner(System.in);

       System.out.println("请输入本金：");
       double money=input.nextDouble();
       System.out.println("本金为："+money);


       double realMoney1=money*1*2.25/100;
       double a=realMoney1+money;

       double realMoney2=money*2*2.7/100;
       double b=realMoney2+money;

       double realMoney3=money*3*3.24/100;
       double c=realMoney3+money;

       double realMoney4=money*5*3.6/100;
       double d=realMoney4+money;
       System.out.println("存取一年后的本息是："+a);
       System.out.println("存取两年后的本息是："+b);
       System.out.println("存取三年后的本息是："+c);
       System.out.println("存取五年后的本息是："+d);
   }

}
