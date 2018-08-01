package train;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreSort {
    public static void main(String[]args){
        int[] scores=new int[5];//成绩数组
        Scanner input=new Scanner(System.in);
        System.out.println("请输入五位学员的成绩：");
        for (int i=0;i<scores.length;i++){
            scores[i]=input.nextInt();
        }
        Arrays.sort(scores);
        System.out.print("学员成绩按升序排列：");
        for (int i=0;i<scores.length;i++){
            System.out.println(scores[i]+"");
        }
    }
}
