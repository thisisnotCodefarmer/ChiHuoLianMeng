package wh.daywork.aug.day10;

public class SiteThreadDemo implements Runnable {
    private int count=10;
    private int num=0;

    @Override
    public void run() {
        while (true) {
            if (count<=0) {
                break;
            }
            num++;
            count--;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"抢到第"+num+"张票，剩余"+count+"张票！");
        }
    }
}

class SiteThreadDemoTest{
    public static void main(String[] args){
        SiteThreadDemo  siteThreadDemo=new SiteThreadDemo();
        Thread person1=new Thread(siteThreadDemo,"A");
        Thread person2=new Thread(siteThreadDemo,"B");
        Thread person3=new Thread(siteThreadDemo,"C");
        person1.start();
        person2.start();
        person3.start();
    }
}