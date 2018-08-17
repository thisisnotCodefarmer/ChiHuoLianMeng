package wh.daywork.july.day15;

public class Computer{
    public String cpu;  //属性  芯片
    public String ram;  //内存
    public String cdrom;//光驱
    public String card;   //显卡
    public String name;

    public void run(){
        System.out.println(name+"正在运行");
    }
    public void stop(){
        System.out.println(name+"已关机");
    }

    public void showInfo(){
        System.out.println(name+"cpu是："+cpu+"\t"+"内存是"+ram+"\t"+"光驱："+cdrom+"\t"+"显卡是："+card);
    }

    public static void main(String[]args){
        //苹果电脑
        Computer  appleCom=new Computer();
        appleCom.name="苹果电脑";
        appleCom.cpu="Inter Core I9";
        appleCom.ram="16G";
        appleCom.cdrom="无";
        appleCom.card="GTX1080Ti";

        //华为电脑
        Computer  huaWeiCom=new Computer();
        huaWeiCom.name="华为电脑";
        huaWeiCom.cpu="AMD Ryzen 5 2600";
        huaWeiCom.ram="8G";
        huaWeiCom.cdrom="有";
        huaWeiCom.card="GTX 9660m";

        appleCom.showInfo();
        appleCom.run();
        appleCom.stop();

        huaWeiCom.showInfo();
        huaWeiCom.run();
        huaWeiCom.stop();

    }
}
