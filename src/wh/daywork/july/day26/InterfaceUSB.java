package wh.daywork.july.day26;

 interface UsbInterface{
    void service();
}
class UDisk implements UsbInterface{
    @Override
    public void service() {
        System.out.println("连接USB接口，开始传输数据");
    }
}
class UsbFan implements UsbInterface {
    @Override
    public void service(){
        System.out.println("连接USB接口，获得电流，风扇开始转动");
    }
}
public class InterfaceUSB {
    public static void main(String[]args){
        UsbInterface uDisk=new UDisk();
        uDisk.service();

        UsbInterface usbFan=new UsbFan();
        usbFan.service();
    }
}
