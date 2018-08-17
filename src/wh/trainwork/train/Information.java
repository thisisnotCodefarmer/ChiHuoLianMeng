package wh.trainwork.train;

import java.util.Scanner;

public class Information {
    public  static void main(String[]args){

        //从控制台接受四位整数
        System.out.print("我行我素购物管理系统>客户信息管理>添加客户信息");
        Scanner input=new Scanner(System.in);
        System.out.print("\n请输入会员号(<4位整数>):");

        int custNo=input.nextInt();

        //判断会员号是否合法
        if(custNo>999&&custNo<10000){
            System.out.println(custNo);
        }else{
            System.out.println("信息录入失败！");
        }

        //从控制台输入生日月份
        System.out.println("请输入会员生日（月/日<用两位数表示>）：");
        int custBirthA=input.nextInt();
        int custBrithB=input.nextInt();
        if (custBirthA>0&&custBirthA<13 && custBrithB>0&&custBrithB<32){
            System.out.println(custBirthA+"/"+custBrithB);
        }else{
            System.out.println("信息录入失败！");
        }
        //从控制台输入积分

        System.out.print("请输入积分：");
        int custScore=input.nextInt();
        System.out.println(custScore);
        //输出录入的信息
        System.out.println("已经录入的会员信息是：\n"+custNo+"\t"+custBirthA+"/"+custBrithB+"\t"+custScore);



    }
}
