package wh.daywork.july.day27;

interface Window{
    public void open();
    public  void close();
    public  void activated();
    public  void iconofied();
    public  void deiconified();
}
//定义抽象类实现接口，在此类中覆写方法，但是所有的方法体为空
abstract class WindowAdapter implements Window{
    @Override
    public  void open(){}
    @Override
    public  void close(){}
    @Override
    public  void activated(){}
    @Override
    public  void iconofied(){}
    @Override
    public  void deiconified(){}
}

//子类直接继承WindowAdapter类，有选择的实现需要的方法
class WindowImp1 extends WindowAdapter{
    @Override
    public void open(){
        System.out.println("窗口打开");
    }
    @Override
    public void close(){
        System.out.println("窗口关闭");
    }
}
public class AdapterDemo {
    public static void main(String[] args){
        //实现接口对象
        Window win=new WindowImp1() ;
        win.open();
        win.close();
    }
}
