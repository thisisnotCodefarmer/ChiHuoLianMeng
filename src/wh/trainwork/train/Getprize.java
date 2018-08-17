package wh.trainwork.train;

import java.util.Scanner;

public class Getprize {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("输入张浩的JAVA成绩：");
        int Score=input.nextInt();
        if(Score>98){
            System.out.println("不错奖励一个MP4！");
        }else{
            System.out.println("接受惩罚");
        }
    }
}
