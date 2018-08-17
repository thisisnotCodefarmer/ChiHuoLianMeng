package wh.trainwork.train;

import java.util.Scanner;

public class BreakDemo {
    public  static  void  main(String[]args){
        int score;
        int sum=0;
        double avg=0.0;
        boolean isNegative=false;
        Scanner input=new Scanner(System.in);
        System.out.print("输入学生姓名：");
        String name=input.next();
        for(int i=0;i<5;i++){
            System.out.print("请输入第"+(i+1)+"门课的成绩：");
            score=input.nextInt();
            if(score<0){
                isNegative=true;
                break;
            }
            sum=sum+score;
        }
        if (isNegative){
            System.out.println("抱歉，分数录入错误，请重新进行录入！");
        }else {
            avg=(double)sum/5;
            System.out.println(name+"的平均分是："+avg);
        }
    }
}
