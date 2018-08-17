package wh.daywork.july.day27;
interface F{
    public String name="wnager";
    public void printA();
}
interface G{
    public void printB();
}
interface H extends F,G{
    public void printC();
}
class XX implements H{
    @Override
    public void printA(){
        System.out.println(123);
    }
    @Override
    public void printB(){
        System.out.println(456);
    }
    @Override
    public void printC(){
        System.out.println(789);
    }
}
public class InterfaceTest3 {
    public static void main(String[] args){
     XX xx=new XX();
     xx.printA();
     xx.printB();
     xx.printC();
    }

}
