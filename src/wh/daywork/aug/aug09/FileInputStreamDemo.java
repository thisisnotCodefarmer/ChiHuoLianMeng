package wh.daywork.aug.aug09;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=null;
        try {
            fileInputStream = new FileInputStream("E:\\myDoc\\hello.txt");
            int data;
            System.out.println("可读取的字节数：" + fileInputStream.available());
            System.out.println("文件内容为：");

            while ((data = fileInputStream.read()) != -1) {
                System.out.print((char) data + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IIOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream!=null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
