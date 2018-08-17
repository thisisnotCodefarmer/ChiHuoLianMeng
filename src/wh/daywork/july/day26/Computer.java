package wh.daywork.july.day26;

/**
*@Description: CPU
*/
interface CPU{
    //得到cpu品牌
    String getCPUBrand();

    //获得CPU主频
    Float getFrequency();
}
interface EMS{
    String getEMSType();

    int getSize();
}
interface HradDisk{
    //获得硬盘大小
    int getCapacity();
}
public class Computer {
    CPU cpu;
    EMS ems;
    HradDisk hradDisk;

    public Computer(CPU cpu,EMS ems,HradDisk hradDisk){
        this.cpu=cpu;
        this.ems=ems;
        this.hradDisk=hradDisk;
    }
    public void showInfo(){
        System.out.println();
    }
}
