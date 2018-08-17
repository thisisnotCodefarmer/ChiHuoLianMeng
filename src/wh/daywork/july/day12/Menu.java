package wh.daywork.july.day12;

import java.util.Scanner;

public class Menu {
    public void showLpginMenu(){
        System.out.println("\n\t欢迎使用我行我素购物管理系统\n");
        System.out.println("\t\t1.登录系统\n");
        System.out.println("\t\t2.退出\n");
        System.out.println("**********************************");
        System.out.println("请选择，输入数字：");
    }
    public void showCustMenu(){
        boolean con;
        con=false;
        Scanner input=new Scanner(System.in);
        do {

            int no=input.nextInt();
            if(no==1){

            }else if (no==2){

            }else if(no==0){

            }else {
                System.out.println("输入错误，请输入正确的数字:");
                con=true;
            }
        }while (con);
    }
    public void showMainMenu(){
        boolean con;
        con=false;
        Scanner input=new Scanner(System.in);
        do {

            int no=input.nextInt();
            if(no==1){
                showCustMenu();
            }else if (no==2){
                showSendGMenu();
            }else if(no==0){
                showLpginMenu();
            }else {
                System.out.println("输入错误，请输入正确的数字:");
                con=true;
            }
        }while (con);
    }
    public  void showSendGMenu(){
        boolean con;
        con=false;
        Scanner input=new Scanner(System.in);

        do {
            int no=input.nextInt();
            if(no==1){
                System.out.println("幸运大放送");
            }else if (no==2){
                System.out.println("幸运抽奖");
            }else if(no==0){
                System.out.println("生日问候");
            }else {
                System.out.println("输入错误，请输入正确的数字:");
                con=true;
            }
        }while (con);

    }
}
