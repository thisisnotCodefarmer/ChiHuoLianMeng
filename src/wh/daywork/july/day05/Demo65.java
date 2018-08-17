package wh.daywork.july.day05;

public class Demo65 {
    public static void main(String[]args){
        int sum=0;
        for(int i=4;i<8;i++){
            if(i%4==0){
                continue;
            }
            sum+=i;
        }
        System.out.println(sum);
    }
}
