package wh.daywork.aug.day10;

public class ClimbThread extends Thread{
    private int time;
    public int num=0;

    public ClimbThread(String name,int time,int kilometer){
        super(name);
        this.time=time;
        this.num=kilometer*1000/100;
    }

    @Override
    public void run() {
        while (num>0) {
            try {
                Thread.sleep(this.time);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"爬完100米！");
            num--;
        }
        System.out.println(Thread.currentThread().getName()+"到达终点！");
    }
}
class ClimbThreadTest{
    public static void main(String[] args){
        ClimbThread youngMan=new ClimbThread("年轻人",500,1);
        ClimbThread oldMan=new ClimbThread("老年人",1500,1);
        System.out.println("*********开始爬山***********");
        youngMan.start();

        oldMan.start();

    }
}