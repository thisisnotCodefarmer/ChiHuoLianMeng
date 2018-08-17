package wh.daywork.july.day02;

import java.util.Scanner;
public class Prog1 {

    private  static int shu(int n){
        if (n==1||n==2) {
            return 1;
        }
        else {
            return shu(n-1)+shu(n-2);
        }
    }
    public static void main(String args[]){

        Scanner input=new Scanner(System.in);
        System.out.print("请输入月份：");
        int n=input.nextInt();

        System.out.println("第"+n+"个月兔子总数是："+shu(n));
    }
}
