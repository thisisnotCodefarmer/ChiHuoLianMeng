package wh.daywork.aug.day10;

public class MyThreadDemo03 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            try {
                Thread.sleep(100);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"运行"+i);
        }
    }
}
class MyThreadDemo03Test{
    public static void main(String[] args){
        System.out.println("*********线程强制执行***********");
        Thread temp=new Thread( new MyThreadDemo03());
        temp.start();
        for (int i = 0; i <20 ; i++) {
            if (i==5) {
                try {
                    temp.join();
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(100);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"运行："+i);
        }
    }
}