package wh.daywork.july.day05;

import java.util.Scanner;

public class Demo62 {
    public static void main(String[] args) {
        int num=0;
        int max=0,min=0;
        do{
            System.out.println("请输出一个整数（输入0结束）：");
            Scanner input=new Scanner(System.in);
            num=input.nextInt();

            num++;
        }while (num==0);{
            System.out.println(max+min);
            }
    }
}
