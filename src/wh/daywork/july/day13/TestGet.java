package wh.daywork.july.day13;

import java.util.Scanner;

public class TestGet {
    public static void main(String[]args){
        StudentBizDemo sb=new StudentBizDemo();
        int [] scores=new int[5];

        Scanner input =new Scanner(System.in);
        System.out.println("请输入成绩：");

        for (int i=0;i<scores.length;i++){
            scores[i]=input.nextInt();
        }
        double avgScore=sb.calAvg(scores);
        System.out.println("平均成绩"+avgScore);

        int maxScore=sb.getMax(scores);
        int minScore=sb.getMin(scores);
        System.out.println("最高分："+maxScore+"\n最低分："+minScore);
    }
}