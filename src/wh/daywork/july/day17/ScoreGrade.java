package wh.daywork.july.day17;

import java.util.Scanner;

public class ScoreGrade {

        public static String isGrade(int score){
            if(score<=100&&score>=90){
                return "A";
            }
            else if (score>=80){
                return "B";
            }
            else if (score>=70){
                return  "C";
            }
            else if (score>=60){
                return  "D";
            }
            else
                return "E";
        }
        public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            System.out.println("请输入学生成绩：");
            int score=input.nextInt();

            System.out.println("这位学生的成绩等级为："+isGrade(score));
        }
    }

