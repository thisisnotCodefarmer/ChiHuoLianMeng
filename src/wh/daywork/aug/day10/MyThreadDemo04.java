package wh.daywork.aug.day10;

public class MyThreadDemo04 implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+"正在运行："+i);
            if (i==3) {
                System.out.println("线程礼让");
                Thread.yield();
            }
        }
    }
}
class MyThreadDemo04Test{
    public static void main(String[] args){
        MyThreadDemo04 myThreadDemo04=new MyThreadDemo04();
        Thread t1=new Thread(myThreadDemo04,"线程A");
        Thread t2=new Thread(myThreadDemo04,"线程B");
        t1.start();
        t2.start();
    }
}