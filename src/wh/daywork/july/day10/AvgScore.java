package wh.daywork.july.day10;

import java.util.Scanner;

public class AvgScore {
    public static void main(String[]args){
        int[] score=new int[4];
        int classNum=3;
        double sum=0.0;
        double[] avg=new double[classNum];

        Scanner input=new Scanner(System.in);
        for(int i=0;i<classNum;i++){//外层循环控制  班级数量
            sum=0.0;
            System.out.println("请输入第"+(i+1)+"个班级的成绩：");
            for (int j=0;j<score.length;j++){//内层循环 控制班级人数
                System.out.println("第"+(j+1)+"个成员的成绩：");
                score[j]=input.nextInt();
                sum+=score[j];
            }
            avg[i]=sum/score.length;
            System.out.println("第"+(i+1)+"个班级参赛学员的平均分："+avg[i]+"\n");
        }
    }
}
