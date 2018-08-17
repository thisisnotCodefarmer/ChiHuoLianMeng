package wh.daywork.aug.day10;

public class MyThreadDemo  implements Runnable  {
    @Override
    public void run()  {
        try {
            System.out.println("线程t正在运行");
            Thread.sleep(500);
            System.out.println("线程t休眠500ms后重新运行");

        }catch (InterruptedException e) {
            System.out.println("线程被中断");
        }
    }
    public static void main(String[] args){
        Thread t = new Thread(new MyThreadDemo());
        System.out.println("线程t新建");
        t.start();
        System.out.println("线程t就绪");
    }
}
