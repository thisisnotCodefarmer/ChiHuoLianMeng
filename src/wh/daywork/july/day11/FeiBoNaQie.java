package wh.daywork.july.day11;

import java.util.Scanner;

public class FeiBoNaQie {

    private static int fun(int n){

        if(n==1 || n==2)

                return 1;

        else
            return fun(n-1)+fun(n-2);

    }
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("请输入数字n：");

        int n=input.nextInt();
        System.out.println("第"+n+"个斐波那契数列为："+fun(n));

    }

}
