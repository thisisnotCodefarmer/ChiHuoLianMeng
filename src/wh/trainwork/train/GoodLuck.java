package wh.trainwork.train;

import java.util.*;

public class GoodLuck {
    public static void main(String[]args){
        //产生随机数
        int random=(int)(Math.random()*10);
        //从控制台接受一个四位会员号
        System.out.println("我行我素购物系统》幸运抽奖\n");
        System.out.print("请输入四位会员号：");
        Scanner input=new Scanner(System.in);
        int custNo=input.nextInt();
        //分解获得百位
        int baiwei=custNo/100%10;
        //判断该会员是不是幸运会员
        if(baiwei==random){
            System.out.println(custNo+"号客户是幸运客户，获得MP3一个");
        }
            else{
                System.out.println(custNo+"好客户，谢谢您的只支持！");
            }
        }
    }

