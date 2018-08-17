package wh.daywork.aug.day10;

public class SiteThreadDemo02 implements Runnable{
    private int count=10;
    private int num=0;
    private boolean flag=false;

    @Override
    public void run() {
        while (!flag) {
            sale();
        }
    }

    public synchronized void sale(){
        if (count<=0) {
            flag=true;
            return;
        }
        num++;
        count--;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"抢到第"+num+"张票，剩余"+count+"张票");
    }
}
class SaitThreadDemo02Test{
    public static void main(String[] args){
        SiteThreadDemo02 siteThreadDemo02=new SiteThreadDemo02();
        Thread person1=new Thread(siteThreadDemo02,"A");
        Thread person2=new Thread(siteThreadDemo02,"B");
        Thread person3=new Thread(siteThreadDemo02,"C");
        person1.start();
        person2.start();
        person3.start();
    }
}