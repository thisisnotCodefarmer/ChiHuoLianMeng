package wh.daywork.aug.aug09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuffferReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fIleReader=null;
        BufferedReader buffferReader=null;
        try {
            fIleReader=new FileReader("E:/myDoc/hello.txt");
            buffferReader=new BufferedReader(fIleReader);
            String  line=buffferReader.readLine();
            while (line!=null) {
                System.out.println(line);
                line=buffferReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("文件不存在！");
        } finally {
            try {
                if (buffferReader!=null) {
                    buffferReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
