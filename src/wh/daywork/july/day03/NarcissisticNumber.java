package wh.daywork.july.day03;

import java.util.Scanner;

public class NarcissisticNumber  {

        static int place(int s)
{
    int i=0;
    for(;s!=0;i++)
    {
        s/=10;
    }
    return i;
}
        static void action(int s,int e)
        {
            int c=0,n;
            for(int i=s;i<=e;i++)
            {
                int sum=0,t=i;
                n=NarcissisticNumber.place(t);
                for(;t!=0;)
                {
                    sum+=Math.pow(t%10,n);
                    t/=10;
                }
                if(i==sum)
                {
                    c++;
                    System.out.println(i+"是水仙花数。");
                }
            }
            if(0==c)
            {
                System.out.println(s+"到"+e+"区间内没有水仙花数。");
            }
        }
        static boolean judge(int s)
        {
            int sum=0,n;
            n=NarcissisticNumber.place(s);
            for(int i=0,t=s;t!=0;i++)
            {
                sum+=Math.pow(t%10, n);
                t/=10;
            }
            if(s==sum)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        /**
         * @param args
         */
        public static void main(String[] args)
        {
            Scanner in=new Scanner(System.in);

            System.out.println("请输入你要判断水仙花数的起始数字");
            int s=in.nextInt();
            System.out.println("请输入你要判断水仙花数的末数字，若只判断一个数是否为水仙花数，请输入1");
            int e=in.nextInt();
            if(e==1|s==e)
            {
                if(NarcissisticNumber.judge(s))
                {
                    System.out.println(s+"是水仙花数。");
                }
                else
                {
                    System.out.println(s+"不是水仙花数。");
                }
            }
            else
            {
                NarcissisticNumber.action(s,e);
            }
        }
}