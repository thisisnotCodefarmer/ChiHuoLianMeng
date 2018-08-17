package wh.daywork.july.day12;

import java.util.Scanner;

public class MonthMethod {
    public int monthNum;
    static String monthName;
    public String show(int monthNum) {

        if (monthNum >= 1 && monthNum <= 12) {
            switch (monthNum) {
                case 1:
                    monthName = "一月";
                    break;
                case 2:
                    monthName = "二月";
                    break;
                case 3:
                    monthName = "三月";
                    break;
                case 4:
                    monthName = "四月";
                    break;
                case 5:
                    monthName = "五月";
                    break;
                case 6:
                    monthName = "六月";
                    break;
                case 7:
                    monthName = "七月";
                    break;
                case 8:
                    monthName = "八月";
                    break;
                case 9:
                    monthName = "九月";
                    break;
                case 10:
                    monthName = "十月";
                    break;
                case 11:
                    monthName = "十一月";
                    break;
                case 12:
                    monthName="十二月";
                    break;
            }
        } else {
            System.out.println("请输入正确的数字");
        }
                return monthName ;
    }
    public static void main(String[]args){
        MonthMethod monthMethod=new MonthMethod();
        Scanner input=new Scanner(System.in);

         int monthNum=input.nextInt();
         monthMethod.show(monthNum);
         System.out.println(monthName);
    }
}
