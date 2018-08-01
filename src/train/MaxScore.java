package train;

import java.util.Scanner;

public class MaxScore {
    public static void main(String[]args){
        int scores[]=new int[5];
        Scanner input=new Scanner(System.in);
        System.out.println("请输入五位同学的成绩：");
        for (int i=0;i<scores.length;i++){
            scores[i]=input.nextInt();
        }
        int max=0;
        max=scores[0];
        for (int i=0;i<scores.length;i++)
            if (scores[i] > max) {
                max = scores[i];
            }
        System.out.println("考试成绩最高分位："+max);
    }
}
