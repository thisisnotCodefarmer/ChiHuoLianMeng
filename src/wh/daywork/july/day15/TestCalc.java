package wh.daywork.july.day15;

import java.util.Scanner;

public class TestCalc {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        CalcUtil ca=new CalcUtil();

        System.out.println("请输入第一个数：");
        ca.num1=input.nextInt();
        System.out.println("请输入第二个数：");
        ca.num2=input.nextInt();

        System.out.println("两数之和为："+ca.plus(ca));
        System.out.println("两数之差为："+ca.sub(ca));
        System.out.println("两数之积为："+ca.mul(ca));
        System.out.println("两数之商为："+ca.div(ca));
    }
}
