package wh.daywork.july.day15;

import java.util.Scanner;

public class ResolvePrime {

    private static void resolve(int n) {
        System.out.print(n + "=");

        // 循环从2开始，因为是除以2
        for (int i = 2; i < n + 1; i++) {
            //只有n能整除 i 并且n不等于i 时
            while (n % i == 0 && n != i) {

                n /= i;
                System.out.print(i + "*");
            }
            //如果这个指数恰等于n，打印设个数
            if (n == i) {
                    System.out.println(i);
                    break;
            }
        }

    }
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("请输入正整数n：");
         int n=in.nextInt();
         resolve(n);
    }
}
