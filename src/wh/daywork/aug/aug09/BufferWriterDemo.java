package wh.daywork.aug.aug09;

import java.io.*;

public class BufferWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("E:/myDoc/hello.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("大家好");
            bufferedWriter.write("我正在学习BufferedWriter。");
            bufferedWriter.newLine();
            bufferedWriter.write("请多多指教");
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.close();

            FileReader fileReader = new FileReader("E:/myDoc/hello.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }catch (IOException e) {
            System.out.println("文件不存在！");
        }finally {
            try {
                if (bufferedWriter!=null) {
                    bufferedWriter.close();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
