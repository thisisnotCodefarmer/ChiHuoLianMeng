package wh.daywork.aug.aug08;


public class EnumDemo {
     public enum Week{
        Mon,TUE,WED,THU,FRI,SAT,SUN
    }
    public void doWhat(Week day){
         switch (day){
             case Mon:
             case TUE:
             case WED:
             case THU:
             case FRI:
                 System.out.println("工作，写代码");
                 break;
             case SAT:
                 System.out.println("休息");
                 break;
             case SUN:
                 System.out.println("休息，玩");
                 break;
                 default:
                     System.out.println("一个星期就是七天");
         }
    }
    public static void main(String[] args){
         EnumDemo enumDemo=new EnumDemo();
         enumDemo.doWhat(Week.THU);
         Week sat=Week.SAT;
         enumDemo.doWhat(sat);
    }
}
