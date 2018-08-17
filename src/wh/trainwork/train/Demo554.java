package wh.trainwork.train;

import java.util.Scanner;

public class Demo554 {
    //华氏摄氏度转换为摄氏度
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入温度（单位华氏度）");
        double f=input.nextDouble();
        double c=5/9.0*(f-32);
        System.out.println("输出摄氏度为："+c);
    }
}
