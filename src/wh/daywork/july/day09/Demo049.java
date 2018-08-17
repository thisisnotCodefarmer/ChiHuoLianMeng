package wh.daywork.july.day09;

import java.util.Scanner;

//机试题2  控制台输入任意的整数，保存到数组；然后把数组元素进行逆序，最后打印出改数组
public class Demo049 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
       System.out.println("请输入整数个数：");

        int[] array=new int[input.nextInt()];;

        System.out.println("要输入"+array.length+"个整数,");
            for(int i=0;i<array.length;i++)
            {
                int num = input.nextInt();
                array[i] = num;
            }

            int temp=0;
            for ( int i=0;i<array.length/2;i++){
                temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
            for(int i=0;i<array.length;i++){
                System.out.print(array[i]+"\t");
            }
    }
}

