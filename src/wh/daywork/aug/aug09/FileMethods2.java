package wh.daywork.aug.aug09;

import javax.imageio.IIOException;
import java.io.*;

public class FileMethods2 {
    public static void main(String[] args){
        FileMethods2 fileMethods2=new FileMethods2();
        File file=new File("E:/myDoc");
        fileMethods2.create(file);
        fileMethods2.showFileInfo(file);
        //fileMethods2.delete(file);
    }

    private void create(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("文件已创建");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void delete(File file) {
        if (file.exists()) {
            file.delete();
            System.out.println("文件已删除");
        }
    }

    private void showFileInfo(File file) {
        if (file.exists()){
            if (file.isFile()) {
                System.out.println("名称："+file.getName());
                System.out.println("相对路劲："+file.getPath());
                System.out.println("绝对路径："+file.getAbsolutePath());
                System.out.println("文件大小："+file.length());
            }
            if (file.isDirectory()) {
                System.out.println("从文件是目录");
            }
        } else {
            System.out.println("文件不存在！");
        }
    }
}
