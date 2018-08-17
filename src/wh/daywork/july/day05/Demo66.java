package wh.daywork.july.day05;

public class Demo66 {
    public static void main(String[]args0){
        for(int i=0;i<3;i++){
            if(i<2){
                System.out.println("i小于2");
                break;
            }
            if (i>0){
                System.out.println("i大于0");
                continue;
            }
        }
    }
}
