package wh.daywork.july.day06;

import java.util.Scanner;

public class Demo046 {
    public static void main(String[]args){
        int month=0;
        int num=0;
        double price=5000;

        System.out.println("请输入出行月份：1~12");
        Scanner input=new Scanner(System.in);
        month=input.nextInt();
        System.out.println("请问你选择头等舱还是经济舱？头等舱输入1，经济舱输入2");
        num=input.nextInt();

        if (month>=4&&month<=10){
            if (num==1){
                price=price*0.9;
            }else {
                price=price*0.8;
            }
                System.out.println(price);
        }else {
            if (num==1){
                price=price*0.5;
            }
            else {
                price=price*0.4;
            }
            System.out.println(price);
        }
    }
}
