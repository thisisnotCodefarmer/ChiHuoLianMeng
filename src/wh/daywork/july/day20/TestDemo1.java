package wh.daywork.july.day20;

public class TestDemo1 {
    static int a=9;
    static {
        int a=13;
        System.out.println(a);
    }
    public static void main(String[]args){
        System.out.println(TestDemo1.a);
    }
}
