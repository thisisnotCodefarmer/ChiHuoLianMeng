package wh.daywork.aug.aug09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
    public static void main(String[] args) throws IOException {
        Writer filewriter=null;
        try {
            filewriter=new FileWriter("E:/myDoc/hello.txt");
            filewriter.write("我热爱我的团队！");
            filewriter.flush();
        } catch (IOException e) {
            System.out.println("文件不存在！");
        } finally {
            try {
                if (filewriter!=null) {
                    filewriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
