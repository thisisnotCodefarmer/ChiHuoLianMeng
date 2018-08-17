package wh.trainwork.train;

import java.util.Scanner;

public class ContinueDemo {
    public  static  void main(String[]args){
        double score=0;
        int total;
        int num=0;
        Scanner input=new Scanner(System.in);
        System.out.print("输入班级总人数：");
        total=input.nextInt();
        for(int i=0;i<total;i++){
            System.out.print("请输入第"+(i+1)+"位学生的成绩：");
            if( score< 80){
                continue;
            }
            num++;
        }
        System.out.println("80分以上的学生人数是:"+num);
        double rate=(double)num/total*100;
        System.out.println("80分以上的学生所占的比例位："+rate+"%");
    }
}
