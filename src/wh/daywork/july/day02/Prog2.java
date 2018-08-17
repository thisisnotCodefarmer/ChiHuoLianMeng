package wh.daywork.july.day02;


//求出1到100所有的素数

public class Prog2 {
    private  static boolean Prime(int n){
        //判断是否素数
        boolean a=true;
        if (n==1){
            a=false;
        }else{
            for (int i=2;i<Math.sqrt(n);i++){
                if ((n%i)==0||n==1){
                    a=false;
                    break;
                }
                else
                    a=true;
            }
        }
        return a;
    }
    public static void main(String args[]){
        int m=1,n=100,count=0;
        //统计素数个数
        for (int i=m;i<=n;i++){
            if (Prime(i)){
                count++;
                System.out.print(i+"\t");

                if (count%10==0){
                    System.out.println();
                }
            }
        }

    }
}
