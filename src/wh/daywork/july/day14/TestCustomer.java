package wh.daywork.july.day14;

import java.util.Scanner;

public class TestCustomer {
    public static void main(String[] args) {
        CustomerName cn=new CustomerName();
        Scanner input=new Scanner(System.in);

        boolean con = true;
        while (con){
            System.out.println("请输入客户的姓名：");
            String newName=input.next();
            cn.addName(newName);

            System.out.println("继续输入吗？（y/n）");
            String choise=input.next();
            if (choise.equals("n")){
                con=false;
            }


        }
        System.out.println("***********************");
        System.out.println("       客户姓名列表     ");
        System.out.println("***********************");

        cn.showNames();


    }
}
