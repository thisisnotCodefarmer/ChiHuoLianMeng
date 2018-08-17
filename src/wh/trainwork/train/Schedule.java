package wh.trainwork.train;

import java.util.Scanner;

public class Schedule {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("查看课程表，请输入日期(1-5):");
        int day=input.nextInt();
        switch (day){
            case 1:
                System.out.println("出席IT科技展");
                break;
            case 2:
                System.out.println("参加亚太会议");
                break;
            case 3:
                System.out.println("游海洋公园");
                break;
            case 4:
                System.out.println("参加股东大会");
                 break;
            case 5:
                System.out.println("自由时间");

        }

    }
}
