package wh.trainwork.train;

import java.util.Scanner;

public class ArgRate {
    public static void main(String[]args){
        int young=0;
        int age=0;
        Scanner input=new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.print("请输入第"+(i+1)+"位顾客的年龄:");
            age=input.nextInt();
            if(age>0&&age<=30){
                young++;
            }
        }
        System.out.println("30岁以下的比例是:"+young/10.0*100+"%");
        System.out.println("30岁以上的比例是:"+(1-young/10.0)*100+"%");
    }
}
