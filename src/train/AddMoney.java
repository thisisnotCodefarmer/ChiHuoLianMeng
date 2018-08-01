package train;

public class AddMoney {
    public static void main(String []args){
        double[] moneys=new double[]{199.9,250.5,300.0,499.0,100.0};
        System.out.println("请输入会员本月的消费记录:");
        for (int i=0;i<moneys.length;i++){
            System.out.println("请输入第一笔购物金额："+moneys[i]);
        }
        double sum=0;
        for (int i=0;i<moneys.length;i++){
            sum=sum+moneys[i];
            System.out.println("序号\t\t"+"金额（元）");
            System.out.println((i+1)+"\t\t"+moneys[i]);
        }
        System.out.println("总金额\t\t"+sum);

    }
    }