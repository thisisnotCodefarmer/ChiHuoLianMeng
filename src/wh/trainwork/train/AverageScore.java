package wh.trainwork.train;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[]args) {
        int score;
        int sum = 0;
        double avg = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("输入学生姓名：");
        String name=input.next();
        for(int i=0;i<5;i++){
            System.out.print("请输入五门功课中第"+(i+1)+"门课的成绩：");
            score=input.nextInt();
            sum=sum+score;
        }
        avg=(double)sum/5;
        System.out.println(name+"的平均分是："+avg);

    }
}
