package wh.trainwork.train;

import java.util.Scanner;

public class CalcDiscount {
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in );
        System.out.println("请输入是否是会员：是（y)/否（其他符号)");
        String identity=input.next();
        System.out.println("请输入购物金额：");
        double money=input.nextDouble();
        if(identity.equals("y")){
            if(money>200){
                money=money*0.75;
            }else{
                money=money*0.8;
            }
        }else{
            if(money>1000){
               money=money*0.9;
            }
        }
        System.out.println("实际支付："+money);
    }
}
