package wh.daywork.july.day25;

import java.util.Scanner;

/**
*@Description: 使用throws抛出异常
*/

public class TestThrows {
    /**
    *@Description: 通过try-catch捕获并处理异常
     * @parma args
    */

    /**
    *@Description: 通过try-catch捕获并处理异常
     * @parma args
    */
    public static void main(String[] args){
        try{
            divide();
        }catch (Exception e){
            System.out.println("出现异常：被除数和除数必须是整数"+"除数不能为零");
            e.printStackTrace();
        }
    }
//    /**
//    *@Description: 通过throws继续声明异常
//    */
//    public static void main(String[] args) throws Exception{
//        divide();
//    }

    public static void divide() throws Exception {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入被除数：");
        int num1=in.nextInt();
        System.out.println("请输入除数：");
        int num2=in.nextInt();
        System.out.println(String.format("%d/%d=%d", num1,num2,num1/num2));
    }
}