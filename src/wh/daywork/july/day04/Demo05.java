package wh.daywork.july.day04;

public class Demo05 {
    public static void main(String args[]){
        int sum=0;
        for(int i=1;i<30;i++){
            if(i%3==0){
                sum+=i;
            }else if(sum>30){
                break;
            }
        }
        System.out.print(sum);
    }
}
