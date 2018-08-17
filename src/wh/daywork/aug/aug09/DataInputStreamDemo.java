package wh.daywork.aug.aug09;

import java.io.*;

public class DataInputStreamDemo {
    public static void main(String[] args) throws IOException {
        DataInputStream dataInputStream=null;
        DataOutputStream dataOutputStream=null;
        try {
            FileInputStream fileInputStream = new FileInputStream("E:/myDoc/FileCopy.class");
            dataInputStream = new DataInputStream (fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream("E:/myDoc/temp.class");
            dataOutputStream = new DataOutputStream(fileOutputStream);

            int temp;
            while ((temp=dataInputStream.read()) != -1) {
                dataOutputStream.write(temp);
            }
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataInputStream != null) {

                    dataInputStream.close();
                }
                if (dataOutputStream!=null) {
                    dataOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
