package wh.trainwork.train;

import java.util.Scanner;

public class LoginMenu {
    public static void main(String[] args) {
        System.out.println("\n\t\t欢迎使用我行我素购物管理系统1.0版\n");
        System.out.println("\n\t\t 1 .登录系统\n");
        System.out.println("\n\t\t 2 .退出\n");
        System.out.println("***************************************\n");
        System.out.println("请选择，输入数字：");
        //从键盘上获取信息，并执行相应操作---新加代码
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt() == true) {
            int num = input.nextInt();
            switch (num) {
                case 1:
                    //显示系统主菜单
                    System.out.println("\n\t\t 欢迎使用我行我素购物管理系统\n");
                    System.out.println("*************************************\n");
                    System.out.println("\t\t\t 1.客户信息管理\n");
                    System.out.println("\t\t\t 2.购物结算\n");
                    System.out.println("\t\t\t 3.真情回馈\n");
                    System.out.println("\t\t\t 4.注销\n");
                    System.out.println("*************************************\n");
                    System.out.println("请选择，输入数字：");
                    break;
                case 2:
                    //退出系统
                    System.out.println("谢谢你的使用！0");
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }
        } else {
            System.out.println("请输入正确的数字！");
        }
    }
}
