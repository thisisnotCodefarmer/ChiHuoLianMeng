package wh.daywork.july.day06;

public class Demo116 {
    public static void main(String []args){
        int rows=4;
        for (int i=1;i<=rows;i++){
        for (int j=1;j<=rows+1-i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
