package wh.daywork.july.day10;

import java.util.Scanner;

/**

 * @Author: wangheng

 * @Date 14:20

 * @param null

 * @Description:
 * 如图 ，打印如下
 * 1
 * 1   2
 * 1   2    3
 * 1   2    3    4
 * 1   2    3    4     5
    。 。 。 。 。  。
 *
 */
public class SanJiaoXing {
    public static void main(String[]args){
        System.out.println("请输入三角形的行数：");

        Scanner input=new Scanner(System.in);
        int[] rows= new  int[input.nextInt()];

        for (int i=1;i<=rows.length;i++){
            for (int j=1;j<=i;j++)

                System.out.print(j);

            System.out.println();
        }
    }
}
