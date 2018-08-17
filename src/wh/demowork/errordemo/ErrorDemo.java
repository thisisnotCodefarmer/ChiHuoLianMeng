package wh.demowork.errordemo;
import java.util.Scanner;

public class ErrorDemo {

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("请输入名字");
            String  name=input.next();
            System.out.println("请输入你的密码");
            String password=input.next();
            if(name.equals("青")&&password.equals("123")){
                System.out.print("输入正确");
            }else {
                System.out.print("你不是青");
            }

        }

    }


