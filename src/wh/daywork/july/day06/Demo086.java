package wh.daywork.july.day06;

public class Demo086 {
    public static void main(String[]args){
       int i=0;
        for ( i=1;i<=5;i++){
            if (i%2!=0){
                i++;
                continue;
            }
        }
        System.out.println(i);

    }
}
