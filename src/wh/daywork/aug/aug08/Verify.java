package wh.daywork.aug.aug08;

import java.util.Scanner;

public class Verify {
    public static void main(String[] args){
        boolean fileCorrect=false;
        boolean emailCorrent=false;
        System.out.println("--------欢迎进入作业提交系统-------");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入JAVA文件名：");
        String fileName=sc.next();
        System.out.println("请输入邮箱：");
        String email=sc.next();

        int index=fileName.lastIndexOf(".");
        if(index!=-1&&fileName.substring(index+1,fileName.length()).equals("java")){
            fileCorrect=true;
        }else{
            System.out.println("文件名无效");
        }

        if (email.indexOf("@")!=-1&&email.indexOf(".")>email.indexOf("@")){
            emailCorrent=true;
        }else {
            System.out.println("E-mail无效");
        }
        if (fileCorrect&&emailCorrent){
            System.out.println("作业提交成功");
        }else{
            System.out.println("提交失败" );
        }
    }

}
