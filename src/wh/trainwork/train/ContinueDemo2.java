package wh.trainwork.train;

public class ContinueDemo2 {
    public static void main(String[]args){
        int sum=0;
        for(int i=1;i<=100;i++){
            //判断i是否满足条件
             if (i%10==2||i%10==3||i%10==4||i%10==7||i%3==0){
                 continue;
             }
             sum=sum+i;
        }
        System.out.println("1-100之间个数不是2,3,4,7，"+"并且不能被3整除的整数和是:"+sum);
    }
}
