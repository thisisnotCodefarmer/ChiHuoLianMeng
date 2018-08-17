package wh.daywork.july.day05;

import java.util.Scanner;

public class Demo55 {
    public static void main(String args[]) {
        int random = (int) (Math.random() * 10);//输入随机数

        //从控制台接受一个四位会员号
        System.out.println("我素购物管理系统>幸运抽奖\n");
        System.out.print("请输入四位会员号");
        Scanner input=new Scanner(System.in);
        int custNo=input.nextInt();

        int baiwei=custNo/100%10;//分解获得百位
        if(baiwei==random){
            System.out.println(custNo+"号客户是幸运客户，获得MP#一个");
        }else {
            System.out.println(custNo+"号客户。谢谢你的支持！");
        }
    }
}