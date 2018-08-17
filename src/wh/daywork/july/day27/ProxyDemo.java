package wh.daywork.july.day27;
/**
*@Description: 代理操作
*/
interface Network{
    public void browse();
}
class Real implements Network{
    @Override
    public void browse(){
        System.out.println("上网浏览信息");
    }
}
class Proxy implements Network{
    private Network network;

    public Proxy(Network network){
        this.network=network;
    }
    public void check(){
        System.out.println("检查用户是否合法");
    }
    @Override
    public void browse(){
        this.check();
        //调用真实上网操作
        this.network.browse();
    }
}
public class ProxyDemo {
    public static void main(String[] args){
        Network net =null;
        net=new Proxy(new Real());
        net.browse();
    }
}
