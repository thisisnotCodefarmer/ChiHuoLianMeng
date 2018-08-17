package wh.trainwork.train;

import java.util.Scanner;

public class ArrayDemo {
        public static void main(String[] args){
            int[] scores=new int[5];
            int sum=0;
            Scanner input=new Scanner(System.in);
            System.out.println("请输入五位学员的成绩：");
            for (int i=0;i<scores.length;i++){
                scores[i]=input.nextInt();
                sum=sum+scores[i];
            }
            System.out.println("学员的平均分："+(double)sum/scores.length);

        }
}
