package wh.daywork.aug.aug09;

import javax.imageio.IIOException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=null;
        try {
            String string="好好学习JAVA";
            byte[] words=string.getBytes();

            fileOutputStream=new FileOutputStream("E:\\myDoc\\hello.txt",true);
            fileOutputStream.write(words,0,words.length);
            System.out.println("hello文件已更新");
        } catch (IOException e) {
            System.out.println("创建文件时出错！");
        } finally {
            try {
                if (fileOutputStream!=null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
