package train;

public class StoreShow {
    public static void main(String[]args){
        String[] names=new String[]{"Nike背包","Adidas运动衫","李宁运动鞋","kappa外套","361°腰包"};
        System.out.println("本次活动特价商品有：");
        for (int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }
}
