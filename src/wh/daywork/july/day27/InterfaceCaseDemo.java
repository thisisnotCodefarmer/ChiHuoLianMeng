package wh.daywork.july.day27;

//定义Message接口
interface IMessage{
    public static final String INFo="www.mldn.com";
    public abstract String getInfo();
}
interface IChanel{
    public abstract boolean connect();
}
class MessageImp1 implements IMessage,IChanel{
    @Override
    public String getInfo(){
        if(this.connect()){
        return " 得到一个信息";
        }
        return "通道创建失败，无法获取消息";
    }
    @Override
    public boolean connect(){
        System.out.println("消息发送通道已经成功建立");
        return  true;
    }
}


public class InterfaceCaseDemo {
    public static void main(String[] args){
        IMessage msg=new MessageImp1() ;
        System.out.println(msg.getInfo());
    }
}
