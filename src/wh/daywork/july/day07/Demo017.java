package wh.daywork.july.day07;

import java.util.*;

public class Demo017 {
    public static void main(String[]args){
		            
        Scanner in=new Scanner(System.in);

        System.out.println("你要什么数字：");
         int k=in.nextInt();

         System.out.println("你要的最高数字：");
         int n=in.nextInt();

         int[] numbers=new int[n];
         for (int i=0;i<numbers.length;i++){
             numbers[i]=i+1;
         }

         int[] result=new int[k];
         for (int i=0;i<result.length;i++){
             int r=(int ) (Math.random()*n);

             result[i]=numbers[r];
             numbers[r]=numbers[n-1];
             n--;
         }

         Arrays.sort(result);
         System.out.println("");
         for (int r:result){
             System.out.println(r);
         }

    }
}
