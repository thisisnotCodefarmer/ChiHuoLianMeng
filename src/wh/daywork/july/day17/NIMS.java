package wh.daywork.july.day17;

import java.util.Scanner;

public class NIMS {

    public String rightName = "admin";
    public String rightPassword = "123456";

    //判读输入的用户名和密码 是否正确
    public void isRight(String name,String password) {

        while (name.equals(rightName)) {
            if (password.equals(rightPassword)) {
                        showName();
            } else {
                System.out.println("请输入正确的用户名和密码！");
            }
        }
    }
    public void showName() {
        String username;
        String[] arr = new String[20];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            username = in.next();
            arr[i] = username;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    public static void main(String[] args) {
        NIMS n=new NIMS();
        Scanner in = new Scanner(System.in);
        //输入用户名和密码
        System.out.println("请输入用户名：");
        String name = in.next();
        System.out.println("请输入密码：");
        String password = in.next();

        n.isRight(name,password);
    }
}
