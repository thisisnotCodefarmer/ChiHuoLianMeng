package wh.daywork.july.day12;

import java.util.Scanner;

public class TestMenu {
    public static void main(String[]args){
        boolean con=true;
        do {
            Menu menu=new Menu();
            menu.showLpginMenu();
            Scanner input=new Scanner(System.in);
            int  choise=input.nextInt();
            switch (choise){
                case 1:
                    menu.showMainMenu();
                    break;
                case 2:
                    System.out.println("谢谢你的使用！");
                    con=false;
                    break;
            }
        }while (con);
    }
}
