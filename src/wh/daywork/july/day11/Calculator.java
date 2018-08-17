package wh.daywork.july.day11;

import java.util.Scanner;

public class Calculator {
    public int jiSuanQi(int x,int y) {
        Scanner input = new Scanner(System.in);
        String fuHao = input.next();
        switch ("fuHao") {
            case "+":
                System.out.println(x + "fuHao" + y + "=" + (x + y));
                break;
            case "-":
                System.out.println(x + "fuHao" + y + "=" + (x - y));
                break;
            case "*":
                System.out.println(x + "fuHao" + y + "=" + (x * y));
                break;
            case "/":
                System.out.println(x + "fuHao" + y + "=" + (x / y));
                break;
                default:
                    System.out.println("输入出错！");
        }
        return jiSuanQi(x,y);
    }
    public static void main(String[]args){
       Calculator calculator=new Calculator();
       calculator.jiSuanQi(2,4);
    }
}

