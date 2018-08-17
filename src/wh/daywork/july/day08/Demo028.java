package wh.daywork.july.day08;

import java.util.Scanner;

public class Demo028 {
    public static void main(String[]args){


        int[] num = new int[4];
        int min = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入四家店的价格：");

        for (int i = 0; i < num.length; i++) {
            System.out.println("请输入第" + (i + 1) + "家店的价格");
            num[i] = sc.nextInt();
        }
        min=num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("最低价格为：" + min);

    }

}
