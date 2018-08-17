package wh.daywork.aug.day10;

public class MyThread extends Thread{
    private String title;

    public MyThread(String title) {
        this.title = title;
    }
    @Override
    public void run(){
        for (int x=0;x<10;x++){
            System.out.println(this.title+"次数");
        }
    }
    public static void main(String[] args){
          new MyThread("abc").start();

          MyThread thread=new  MyThread("wudi");
          thread.start();

          MyThread t1=new MyThread("1");
          t1.run();
    }

}
