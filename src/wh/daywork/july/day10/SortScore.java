package wh.daywork.july.day10;

import java.util.Scanner;

public class SortScore {
    public static void main(String[]args){
        int[] scores=new int[5];
        Scanner input=new Scanner(System.in);
        System.out.println("请输入五位同学的成绩：");
        //获取同学成绩
        for (int i=0;i<scores.length;i++){
            System.out.print("请输入第"+(i+1)+"个同学的成绩：");
            scores[i]=input.nextInt();
        }
        //冒泡排序同学成绩
        for(int i=0;i<scores.length-1;i++){
            for (int j=0;j<scores.length-1-i;j++){
                if (scores[j]<scores[j+1]){
                    // 交换元素
                     int temp=scores[j];
                     scores[j]=scores[j+1];
                     scores[j+1]=temp;
                }
            }
        }
        System.out.println("排序后的成绩为：");
        for (int score:scores){
            System.out.println(score+"\t");
        }
    }
}
