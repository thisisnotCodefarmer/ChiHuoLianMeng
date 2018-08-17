package wh.trainwork.train;

import java.util.Scanner;

public class SumTable {
        public static void main(String[]args){
            int i,j;
            Scanner input=new Scanner(System.in);
            System.out.print("请输入一个值：");
            int val=input.nextInt();
            System.out.println("根据这个值可以输入一下加法表：");
            for (i=0,j=val;i<=val;i++,j--){
                System.out.println(i+"+"+j+"="+(i+j));
            }
    }
}
