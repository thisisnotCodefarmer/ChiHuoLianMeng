package wh.daywork.july.day10;

import java.util.Scanner;

public class MaxMin {
    public static void maxMin() {
        int[] scores = new int[3];
        int max = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输出成绩");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输出：" + (i + 1) + "同学的成绩：");
            scores[i] = input.nextInt();
        }
        max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        System.out.println("最高分为：" + max);

        int min = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
            System.out.println("最低分为：" + min);
        }
    }
        public  static void main(String[]args){
        maxMin();
        }
}
