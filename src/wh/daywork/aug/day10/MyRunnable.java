package wh.daywork.aug.day10;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        for (int i = 1; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
 class Test{
    public static void main(String[] args){
        MyRunnable myRunnable = new MyRunnable();
        Thread myThread = new Thread(myRunnable);
         myThread.start();
    }
}