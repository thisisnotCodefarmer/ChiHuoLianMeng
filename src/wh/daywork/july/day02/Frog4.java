package wh.daywork.july.day02;

import java.util.Scanner;

public class Frog4 {
    public static  void  main(String aegs[]){
        Scanner input=new Scanner(System.in);
        System.out.print("请输入甲同学的语文成绩：");
        double score1=input.nextDouble();
        System.out.print("请输入乙同学的语文成绩：");
        double score2=input.nextDouble();
         double Avg=(score1+score2)/2;
         double sum=score1+score2;
         System.out.println("两同学成绩之和："+sum+"\n两同学成绩平均数是："+Avg);
         input.close();
    }
}
