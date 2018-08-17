package wh.daywork.july.day03;

public class FourLeafRose {

    public static int fours(int n){

        return n*n*n*n;
    }
    public static boolean isFourLeafRose(int number){
        int  qianwei=number/1000;
        int baiwei=number/100-qianwei*10;
        int shiwei=number/10-baiwei*10-qianwei*100;
        int  gewei=number%10;

        return fours(qianwei)+fours(baiwei )+fours(shiwei)+fours(gewei)==number;
    }
    public  static void main(String[]args){
        System.out.println("四叶玫瑰数：");
        for (int index=1000;index<10000;index++){
            if(isFourLeafRose(index))
                System.out.println(index+"  ");
        }
    }
}
