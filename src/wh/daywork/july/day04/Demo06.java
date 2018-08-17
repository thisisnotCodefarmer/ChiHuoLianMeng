package wh.daywork.july.day04;

public class Demo06 {

    public static void main(String args[]){
        int i=1,sum=0;
        while (i<=10){
            i++;
            if(i%5==2){
                continue;
            }
            sum+=i;
        }
        System.out.print(sum);
    }
}
