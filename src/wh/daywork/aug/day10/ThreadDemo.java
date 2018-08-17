package wh.daywork.aug.day10;

public class ThreadDemo {
    public static void main(String[] args){
        System.out.println("Wait");
        Wait.bySec(5);
        System.out.println("Start!");
    }
}
