package wh.daywork.aug.aug09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        Reader filereader = null;
        StringBuffer stringBuffer = null;
        try {
            filereader=new FileReader("E:\\myDoc\\                  hello.txt");
            char[] chars=new char[1024];
            stringBuffer=new StringBuffer();
            int length=filereader.read(chars);
            while ((length!=-1)) {
                stringBuffer.append(chars);
                length=filereader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (filereader!=null) {
                    filereader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
