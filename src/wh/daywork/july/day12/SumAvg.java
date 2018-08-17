package wh.daywork.july.day12;

//2.功能方法：根据整数区间值，获取总数和平均数；注意一个方法如何返回多个值

import java.util.Scanner;

public class SumAvg {
        private static final int List = 0;
        static int sum;
        static int avg;

        public String getNum(int i, int j) {
            //List list=new ArrayList<>();
            int sum = 0;
            double avg = 0, count = 0;
            for (int a = i; a <= j; a++) {
                sum = sum + a;
                count++;
            }
            avg = sum / count;
//		list.add(sum);
//		list.add(avg);

            return sum + " 平均数" + avg;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入第一个数");
            int i = sc.nextInt();
            System.out.println("输入第二个数");
            int j = sc.nextInt();
            SumAvg getnum = new SumAvg();

            System.out.println("输出的和为" + getnum.getNum(i, j));

        }
    }





